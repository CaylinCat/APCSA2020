package Pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisBall extends Ball
{

   //constructors
   public InvisBall()
   {
		super();
   }

   public InvisBall(int x, int y)
   {
	   super(x,y);
   }

   public InvisBall(int x, int y, int wid, int ht)
   {
	   super(x,y,wid,ht);
   }
   public InvisBall(int x, int y, int wid, int ht, Color c) {
	   super(x,y,wid,ht,c);
   }

   public InvisBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
   }

   public InvisBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);
   }
   
   public void setInvis() {
	   if(randomChance() > 200)
		   super.setColor(Color.white);
	   else
		   super.setColor(Color.blue);
   }

   public int randomChance()
   {
   		int r = (int)(Math.random()*256);
 		return r;
   }

   public void moveAndDraw(Graphics window)
   {
	   setInvis();
	   super.moveAndDraw(window);
   }
}