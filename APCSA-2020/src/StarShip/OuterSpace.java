package StarShip;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo amu;
	private Bullets bull;
	private AlienHorde ali;

	/* uncomment once you are ready for this part
	 *
   private AlienHorde horde;
	private Bullets shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(100,400,100,100,5);
		//alienOne = new Alien(90,40,60,60,5);
		//alienTwo = new Alien(150,40,60,60,5);
		//amu = new Ammo(10,10,2);
		bull = new Bullets();
		ali = new AlienHorde(6);
		ali.fillIt(100, 40, 60, 60, 5);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true) {
			ship.move("LEFT");
		}
		if(keys[1] == true) {
			ship.move("RIGHT");
		}
		if(keys[2] == true) {
			ship.move("UP");
		}
		if(keys[3] == true) {
			ship.move("DOWN");
		}
		if(keys[4] == true){
			bull.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5,ship.getY() - 5, 5));
		}
		


		
		//add code to move Ship, Alien, etc.
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		bull.drawEmAll(graphToBack);
		bull.moveEmAll(true);
		ali.drawEmAll(graphToBack);
		
		if((int)(Math.random()*20) == 1)
			ali.moveEmAll(true);

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		ali.removeDeadBullets(bull);
		
		if(ali.getAliens().size()==0) {
			ali.fillIt(100, 40, 60, 60, 5);
		}
		
		//System.out.println(ali.getAliens().size());
	/*	for(Alien a :ali.getAliens()) {
			for(Ammo am : bull.getAmmo()) {  
				if (am.getX() >= a.getX() && am.getX() <= a.getX() + am.getWidth() && am.getY() >= a.getY() && am.getY() <= a.getY() + a.getHeight()) {
					bull.removeAmmo(am);
					ali.removeAlien(a);
				}
			}
		} */

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

