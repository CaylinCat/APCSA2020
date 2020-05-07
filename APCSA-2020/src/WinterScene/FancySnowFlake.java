package WinterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}
	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xspd, int yspd) {
		super(x,y,wid,ht,col,xspd,yspd);
	}

	@Override
	public void draw(Graphics window) {
		window.setColor(super.getColor());
	    window.fillRect(super.getXPos(), super.getYPos(), getWidth(), getHeight());
	}
	public void draw(Graphics window, Color col) {
		int s = (int)(8/5*super.getWidth());
		int ss = (int)(28/10*super.getWidth());
		int sss = (int)(23/10*super.getWidth());
		int c = (int)(48/10*super.getWidth());
		int cc = (int)(38/10*super.getWidth());
		int ccc = (int)(18/10*super.getWidth());
/*		int[] x = {super.getXPos(),super.getXPos()-8,super.getXPos(),super.getXPos()+8,super.getXPos(),super.getXPos()+28,super.getXPos()+23,
				super.getXPos()+8,super.getXPos(),super.getXPos()-28, super.getXPos()-23,super.getXPos()-8,super.getXPos()};
		int[] y = {super.getYPos(),super.getYPos()-28,super.getYPos()-48,super.getYPos()-28,super.getYPos(),super.getYPos()+8,super.getYPos()+38, 
				super.getYPos()+18,super.getYPos(),super.getYPos()+8,super.getYPos()+38,super.getYPos()+18,super.getYPos()};  
				*/ 
		int[] x = {super.getXPos(),super.getXPos()-s,super.getXPos(),super.getXPos()+s,super.getXPos(),super.getXPos()+ss,super.getXPos()+sss,
				super.getXPos()+s,super.getXPos(),super.getXPos()-ss, super.getXPos()-sss,super.getXPos()-s,super.getXPos()};
		int[] y = {super.getYPos(),super.getYPos()-ss,super.getYPos()-c,super.getYPos()-ss,super.getYPos(),super.getYPos()+s,super.getYPos()+cc, 
				super.getYPos()+ccc,super.getYPos(),super.getYPos()+s,super.getYPos()+cc,super.getYPos()+ccc,super.getYPos()};
				
		//System.out.println(s);
		int z = x.length;
	    window.setColor(col);
	    //window.fillRect(super.getXPos(), super.getYPos(), getWidth(), getHeight());
	    window.drawPolygon(x, y, z);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		//draw(window, Color.white);
		super.setYPos(super.getYPos()+super.getYSpeed());
	    draw(window, Color.white);
	}
	
}


