package StarShip;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int size;
	private int owo=1;
	private int prev;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		this.size = size;
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	public void removeAlien(Alien hi) {
		aliens.remove(hi);
	}
	
	public void fillIt(int x, int y, int w, int h, int s) {
		int nX = x;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(nX, y, w, h, s));
			nX+=100;
		}
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien hi : aliens) {
			hi.draw(window);
		}
	}

	public void moveEmAll()
	{
		/*int hii = (int)(Math.random()*3)+1;
		if(hii==1)
			direction = "RIGHT";
		if(hii==2)
			direction = "LEFT";
		if(hii==3)
			direction = "DOWN"; */
		if(owo==1) {
			for(Alien hi : aliens) {
				hi.move("RIGHT");
				hi.move("RIGHT");
				hi.move("RIGHT");
			}
			owo=3;
			prev=1;
		} else if(owo==2) {
			for(Alien hi : aliens) {
				hi.move("LEFT");
				hi.move("LEFT");
				hi.move("LEFT");
			}
			owo=3;
			prev=2;
		} else if(owo==3) {
			for(Alien hi : aliens) {
				hi.move("DOWN");
				hi.move("DOWN");
				hi.move("DOWN");
			}
			if(prev==1)
				owo=2;
			else
				owo=1;
		}
			
	}
	
	public List<Alien> getAliens(){
		return aliens;
	}

	public void removeDeadBullets(Bullets bull) {
		if (bull.getAmmo().size() > 0) {
			for(int i=0; i<aliens.size(); i++) {
				for (int j = 0; j < bull.getAmmo().size(); j++) {
					if (bull.getAmmo().get(j).didCollide(aliens.get(i))) {
						aliens.remove(i);
						break;
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
