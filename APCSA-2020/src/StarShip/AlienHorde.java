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
	private int numDead=0;

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
	
	public void fillItDown(int x, int y, int w, int h, int s) {
		int nY = y;
		for (int i = 0; i < size; i++) {
			aliens.add(new Alien(x, nY, w, h, s));
			nY+=100;
		}
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien hi : aliens) {
			hi.draw(window);
		}
	}

	public void moveEmAll(boolean down)
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
			if(down == true) {
				owo=3;
				prev=1;
			} else {
				owo=2;
				prev=1;
			}
		} else if(owo==2) {
			for(Alien hi : aliens) {
				hi.move("LEFT");
				hi.move("LEFT");
				hi.move("LEFT");
			}
			if(down == true) {
				owo=3;
				prev=2;
			} else {
				if(prev==3)
					owo=4;
				else
					owo=3;
			}
		} else if(owo==3) {
			for(Alien hi : aliens) {
				hi.move("DOWN");
				hi.move("DOWN");
				hi.move("DOWN");
			}
			if(down == true) {
				if(prev==1)
					owo=2;
				else
					owo=1;
			} else {
				owo=2;
				prev=3;
			}
		} else if (owo==4) {
			for(Alien hi : aliens) {
				hi.move("UP");
				hi.move("UP");
				hi.move("UP");
			}
			owo=2;
			prev=4;
		}
			
		//System.out.println(owo);
	}
	
	public List<Alien> getAliens(){
		return aliens;
	}
	
	public int getNumDead() {
		return numDead;
	}
	
	public int getX() {
		return aliens.get(0).getX();
	}

	public void removeDeadBullets(Bullets bull) {
		if (bull.getAmmo().size() > 0) {
			for(int i=0; i<aliens.size(); i++) {
				for (int j = 0; j < bull.getAmmo().size(); j++) {
					if (bull.getAmmo().get(j).didCollide(aliens.get(i))) {
						aliens.remove(i);
						numDead++;
						break;
					}
				}
			}
		}
	}
	
	public boolean shouldBeDead(Ship ship) {
		for(int i=0; i<aliens.size(); i++) {
			if (ship.didCollide(aliens.get(i))) {
				return true;
			}
		}
		return false;
	}
	public void alienMurderer(Ship ship) {
		for(int i=0; i<aliens.size(); i++) {
			if (ship.didCollide(aliens.get(i))) {
				aliens.remove(i);
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
