package MealGame;

import java.awt.Component;

import javax.swing.JFrame;

import StarShip.NewSpace;
import StarShip.StarFighter;

public class KitchenMaker extends JFrame{
	private static final int WIDTH = 900;
	private static final int HEIGHT = 650;

	public KitchenMaker()
	{
		super("MEALGAME");
		setSize(WIDTH,HEIGHT);

		Kitchen theGame = new Kitchen();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		KitchenMaker run = new KitchenMaker();
	}
}