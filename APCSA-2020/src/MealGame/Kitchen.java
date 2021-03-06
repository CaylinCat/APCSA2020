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
	private MessageBoard board;
	private int foods, speed;
	
	private boolean[] keys;
	private BufferedImage back;
	
	public Kitchen(String hi) {
		
		setBackground(Color.white);
		keys = new boolean[3];
		
		//#Stuff boiss
		player = new Player(400,450, hi, 90,130,5);
		oven = new Oven(760,460,120,120,"Images/oven.jpg");
		compost = new Compost(0,450,90,130,"Images/compost.jpg");
		fal = new FallingIngredients(2);
		fal.fillIt(200, 0, 100, 100, 1, "Images/veg carrot.jpg", "carrot", "vegetable");
		foods=0;
		speed=1;
		meal = new Meals();
		board = new MessageBoard();
		
		
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
		graphToBack.drawString("Meal Game ", 25, 50 );
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
		
		player.didCollideComWithIngredient(compost, fal);
		player.didCollideOvenWithIngredient(oven, meal, board);
		
		fal.drawEmAll(graphToBack);
		
		if((int)(Math.random()*2) == 1)
			fal.moveEmAll(true);

		fal.removeIngredients(player);
		fal.removeBottonIngredients(meal,board);
		
		if(fal.getIngredients().size()==1) {
			//fal.fillIt(100, 40, 100, 100, 5, "Images/veg carrot.jpg", "carrot", "vegetable");
			//int num = 1;
			int num = (int) (Math.random()*20);
			int x = (int) (Math.random()*600+100);
			
			if(num == 0)
				fal.add(x, 40, 100, 100, speed, "Images/dairy cheese.jpg", "cheese" + foods, "dairy");
			else if(num == 1)
				fal.add(x, 40, 60, 120, speed, "Images/dairy ice cream.jpg", "ice cream" + foods, "dairy");
			else if(num == 2)
				fal.add(x, 40, 80, 100, speed, "Images/dairy milk.jpg", "milk" + foods, "dairy");
			else if(num == 3)
				fal.add(x, 40, 100, 100, speed, "Images/dairy yogurt.jpg", "yogurt" + foods, "dairy");
			else if(num == 4)
				fal.add(x, 40, 100, 100, speed, "Images/fruit apple.png", "apple" + foods, "fruit");
			else if(num == 5)
				fal.add(x, 40, 110, 70, speed, "Images/fruit banana.jpg", "banana" + foods, "fruit");
			else if(num == 6)
				fal.add(x, 40, 100, 100, speed, "Images/fruit orange.png", "orange" + foods, "fruit");
			else if(num == 7)
				fal.add(x, 40, 80, 110, speed, "Images/fruit pear.png", "pear" + foods, "fruit");
			else if(num == 8)
				fal.add(x, 40, 100, 100, speed, "Images/grain bread.jpg", "bread" + foods, "grain");
			else if(num == 9)
				fal.add(x, 40, 100, 100, speed, "Images/grain pasta.jpg", "pasta" + foods, "grain");
			else if(num == 10)
				fal.add(x, 40, 100, 90, speed, "Images/grain pretz.jpg", "pretz" + foods, "grain");
			else if(num == 11)
				fal.add(x, 40, 100, 80, speed, "Images/grain rice.jpg", "rice" + foods, "grain");
			else if(num == 12)
				fal.add(x, 40, 100, 100, speed, "Images/meat bacon.png", "bacon" + foods, "meat");
			else if(num == 13)
				fal.add(x, 40, 100, 90, speed, "Images/meat beaf.png", "beaf" + foods, "meat");
			else if(num == 14)
				fal.add(x, 40, 100, 100, speed, "Images/meat chicken.jpg", "chicken" + foods, "meat");
			else if(num == 15)
				fal.add(x, 40, 100, 100, speed, "Images/meat fish.jpg", "fish" + foods, "meat");
			else if(num == 16)
				fal.add(x, 40, 95, 110, speed, "Images/veg broccoli.jpg", "broccoli" + foods, "vegetable");
			else if(num == 17)
				fal.add(x, 40, 100, 100, speed, "Images/veg carrot.jpg", "carrot" + foods, "vegetable");
			else if(num == 18)
				fal.add(x, 40, 90, 120, speed, "Images/veg corn.jpg", "corn" + foods, "vegetable");
			else if(num == 19)
				fal.add(x, 40, 100, 100, speed, "Images/veg lettuce.png", "lettuce" + foods, "vegetable");
			
			foods++;
		}
		
		
		if(meal.getNum(0) == 0 && meal.getNum(1) == 0 && meal.getNum(2) == 0 && meal.getNum(3) == 0 && meal.getNum(4) == 0) {
			meal.removeFirstFive();
			meal.increaseMealsDone();
			meal.updateScore();
			board.changeMessage("Nice job! You earned: " + meal.getPointValue() + " points!!");
			//System.out.println(meal.getNum(0) + meal.getNum(1) + meal.getNum(2) + meal.getNum(3) + meal.getNum(4));
		}
		
		if(foods==15 || foods==35 || foods==55 || foods==75 || foods==100) {
			speed++;
			foods++;
		}
		if(foods==20 || foods==40 || foods==60 || foods==85) {
			speed--;
			foods++;
		}
		
		//System.out.println(speed);
		
		//System.out.println(player.hasIngredient());
		
		graphToBack.setFont(new Font("Serif", Font.BOLD, 25));
		graphToBack.setColor(Color.black);
		graphToBack.drawString(meal.toString(), 70, 100);
		graphToBack.drawString(meal.scoreString(), 380, 150);
		graphToBack.drawString(board.getMessage(), 280, 200);
		//graphToBack.drawString("You've completed " + meal.getMealsDone() + " meals!", 300, 250);
		
		
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