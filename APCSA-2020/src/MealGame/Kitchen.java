package MealGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import StarShip.Ammo;

public class Kitchen extends Canvas implements KeyListener, Runnable{
	
	private Player player;
	private Oven oven;
	private Compost compost;
	private FallingIngredients fal;
	private Meals meal;
	
	private boolean[] keys;
	private BufferedImage back;
	
	public Kitchen() {
		
		setBackground(Color.white);
		keys = new boolean[3];
		
		//#Stuff boiss
		player = new Player(400,450, "girl.png", 90,130,5);
		oven = new Oven(760,460,120,120,"oven.jpg");
		compost = new Compost(0,450,90,130,"compost.jpg");
		fal = new FallingIngredients(2);
		fal.fillIt(200, 0, 100, 100, 5, "veg carrot.jpg", "carrot", "vegetable");
		meal = new Meals();
		
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}
	
	public void update(Graphics window) {
		paint(window);
	}
	
	public void paint(Graphics window) {

		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(0,0,900,650);

		if(keys[0] == true) {
			player.move("LEFT");
		}
		if(keys[1] == true) {
			player.move("RIGHT");
		}
		if(keys[2] == true) {
			//stuff
		}
		
		
		//Stuff
		
		oven.draw(graphToBack);
		compost.draw(graphToBack);
		player.draw(graphToBack);
		
		//player.didCollideComWithIngredient(compost, fal);
		player.didCollideOvenWithIngredient(oven, meal);
		
		fal.drawEmAll(graphToBack);
		
		if((int)(Math.random()*20) == 1)
			fal.moveEmAll(true);

		fal.removeIngredients(player);
		
		if(fal.getIngredients().size()==0) {
			fal.fillIt(100, 40, 100, 100, 5, "veg carrot.jpg", "carrot", "vegetable");
		}
		
		//System.out.println(player.hasIngredient());
		
		graphToBack.setFont(new Font("Serif", Font.BOLD, 25));
		graphToBack.setColor(Color.black);
		graphToBack.drawString(meal.toString(), 60, 100);
		
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
	

	@Override
	public void run() {
		try {
	   		while(true) {
	   		   Thread.currentThread().sleep(5);
	            repaint();
	        }
	    } catch(Exception e) {
	    }
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[2] = true;
		}
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[2] = false;
		}
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}