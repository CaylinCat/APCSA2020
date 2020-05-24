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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>(0);
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo hi : ammo) {
			hi.draw(window);
		}
	}

	public void moveEmAll(boolean up)
	{
		if(up == true) {
			for (Ammo hi : ammo) {
				hi.move("UP");
			}
		} else {
			for (Ammo hi : ammo) {
				hi.move("RIGHT");
			}
		}
	}
	
	public List<Ammo> getAmmo() {
		return ammo;
	}
	
	public void removeAmmo(Ammo hi) {
		ammo.remove(hi);
	}


	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
