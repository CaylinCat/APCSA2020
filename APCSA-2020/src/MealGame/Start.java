package MealGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Start {
	private static final int WIDTH = 900;
	private static final int HEIGHT = 650;
	
	public Start() {

	}

	public static void main(String[] args) {  
	    JFrame f=new JFrame("Start Screen");  
	    JLabel tf = new JLabel("~ Meal Game ~");
	    tf.setFont(new Font("Serif", Font.BOLD, 80));
	    tf.setBounds(180,20,800,100);  
	    JLabel author = new JLabel("Created by Caylin Canoy");
	    author.setFont(new Font("Serif", Font.BOLD, 18));
	    author.setBounds(340,78,300,100);  
	    JTextArea mes = new JTextArea("Welcome to Meal Game! An educational fun game created to teach kids \nabout the 5 food groups: "
	    		+ "vegetables, fruits, grain, protein, and dairy and \nalso to teach kids not to waste the food. \n\nMove using "
	    		+ "left and right arrow keys. \nRun into food to pick them up. Go to the oven to put the food in the meal, \nor "
	    		+ "go to the compost to discard the food. \n\n Don't let the food reach the bottom of the screen! \n\n "
	    		+ "Earn points by completing meals and have fun!!!! \n\n Select your character to start the game!!");
	    //mes.setAlignmentX(Component.CENTER_ALIGNMENT);
	    mes.setFont(new Font("Serif", Font.BOLD, 14));
	    mes.setBounds(205, 150, 480, 300);
	    JLabel mom = new JLabel("\"Eat your veggies\" - mom");
	    mom.setFont(new Font("Serif", Font.BOLD, 25));
	    mom.setBounds(300, 450, 600, 100);
	    //mes.setPreferredSize(new Dimension(200,200));
	    JButton b=new JButton(new ImageIcon(Start.class.getResource("Images/girl.png")));  
	    b.setBounds(700,200,160,250);  
	    JButton c=new JButton(new ImageIcon(Start.class.getResource("Images/boy2.png")));  
	    c.setBounds(30,200,160,250); 
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
	            f.setVisible(false);
	            new KitchenMaker("Images/girl.png").setVisible(true);
	        }  
	    });
	    c.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            f.setVisible(false);
	    	            new KitchenMaker("Images/boy2.png").setVisible(true);
	    	}  
	    });
	    f.add(b);
	    f.add(c);
	    f.add(mes);
	    f.add(mom);
	    f.add(author);
	    f.add(tf);  
	    f.setSize(WIDTH,HEIGHT);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	    
	    //file creation
	    try {
	        File badVeg = new File("IncorrectFoods.txt");
	        if (badVeg.createNewFile()) {
	          System.out.println("File created: " + badVeg.getName());
	          System.out.println(badVeg.getParent());
	        } else {
	          System.out.println("File exists already!!!");
	        }
	      } catch (IOException e) {
	        System.out.println("Oh no DD:");
	      }
	    
	    
	}  
	
}