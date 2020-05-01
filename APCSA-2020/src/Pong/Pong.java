package Pong;
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

public class Pong extends Canvas implements KeyListener, Runnable
{
	//private Ball ball;
	//private SpeedUpBall ball;
	//private InvisBall ball;
	private BlinkyBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int player1, player2, width, height;
	private Wall top, right, left, bottom;


	public Pong()
	{
		//set up all variables related to the game
		width = 800;
		height = 800;
		ball = new BlinkyBall(300,300,10,10,Color.blue);
		//ball = new SpeedUpBall(300,300,10,10,Color.blue,2,2);
		//ball = new Ball(300,300,10,10,Color.blue);
		//ball = new InvisBall(300,300,10,10,Color.blue);
		leftPaddle = new Paddle(20,20,20,100,2);
		rightPaddle = new Paddle(720,20,20,100,2);
		top = new Wall(0,0,width,0);
		right = new Wall(width,0,0,height);
		left = new Wall(0,0,0,height);
		bottom = new Wall(0,height,0,0);
		player1 = 0;
		player2 = 0;
		//System.out.println(height);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		width = getWidth();
		height = getHeight();
		top = new Wall(0,0,width,0);
		right = new Wall(width,0,0,height);
		left = new Wall(0,0,0,height);
		bottom = new Wall(0,height-10,0,0);
		graphToBack.drawString("Player 1: " + player1, 300, 100);
		graphToBack.drawString("Player 2: " + player2, 300, 120);
		//graphToBack.drawString(""+getHeight() + " " + getWidth(), 300, 120);


		//see if ball hits left wall or right wall
		//if(!(ball.getX()>=10))
		if(ball.didCollideLeft(left))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Player 2: " + player2, 300, 120);
			player2++;
			ball.resetBall(graphToBack);
		}
		//if(!(ball.getX()<=getWidth()-10))
		if(ball.didCollideRight(right))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Player 1: " + player1, 300, 100);
			player1++;
			ball.resetBall(graphToBack);
		}
		
		//see if the ball hits the top or bottom wall 
		//if(!(ball.getY()>=20 && ball.getY()<=getHeight()-30))
		if(ball.didCollideBottom(bottom) || ball.didCollideTop(top))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		//if(ball.getX() < leftPaddle.getX() + leftPaddle.getWidth() && ball.getY() < leftPaddle.getY() + leftPaddle.getHeight() && ball.getY() > leftPaddle.getY()) {
		if(ball.didCollideLeft(leftPaddle) && !(ball.didCollideBottom(leftPaddle)) && !(ball.didCollideTop(leftPaddle))) {
			ball.setXSpeed(-ball.getXSpeed());
			//ball.setColor(ball.randomColor());
			//ball.setXSpeed();
		}
		
		//see if the ball hits the right paddle
		//if(ball.getX() > rightPaddle.getX() && ball.getY() < rightPaddle.getY() + rightPaddle.getHeight() && ball.getY() > rightPaddle.getY()) {
		if(ball.didCollideRight(rightPaddle) && !(ball.didCollideBottom(rightPaddle)) && !(ball.didCollideTop(rightPaddle))) {	
			ball.setXSpeed(-ball.getXSpeed());
			//ball.setColor(ball.randomColor());
			//ball.setXSpeed();
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true) {
			if(leftPaddle.getY()>=10) {
				leftPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[1] == true) {
			if(leftPaddle.getY()<=(getHeight()-leftPaddle.getHeight())) {
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		if(keys[2] == true) {
			if(rightPaddle.getY()>=10) {
				rightPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if(keys[3] == true) {
			if(rightPaddle.getY()<=(getHeight()-rightPaddle.getHeight())) {
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}

		

		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}