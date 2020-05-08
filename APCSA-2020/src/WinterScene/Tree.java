package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape
{
   public Tree(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }
   
   public void draw(Graphics window)
   {
	   int[] x = {super.getXPos(),(int)(super.getXPos()*1.5),(int)(super.getXPos()/2)};
	   int[] y = {super.getXPos(),super.getXPos()*2,super.getXPos()*2};
	   int z = x.length;
	   window.setColor(Color.green);
	   window.fillPolygon(x,y,z);
   }
   public void draw(Graphics window, Color col)
   {
	   int[] x = {super.getXPos(),(int)(super.getXPos()*1.5),(int)(super.getXPos()/2)};
	   int[] y = {super.getXPos(),super.getXPos()*2,super.getXPos()*2};
	   int z = x.length;
	   window.setColor(col);
	   window.fillPolygon(x,y,z);
   }

   public void moveAndDraw(Graphics window)
   {
	   int r = (int)(Math.random()*256);	
	   int g = (int)(Math.random()*256);
	   int b = (int)(Math.random()*256);
       draw(window, new Color(r,g,b));   
   }
}