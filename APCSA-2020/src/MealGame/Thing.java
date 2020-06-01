package MealGame;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Thing {
	
	int x, y, w ,h;
	Image i;
	
	public Thing() {
		x = 20;
		y = 20;
	}
	
	public Thing(int x, int y, int w, int h, String s) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		URL url = getClass().getResource(s);
		try {
			i = ImageIO.read(url);
		} catch (IOException e) {
			System.out.println("Not here!");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getI() {
		return i;
	}
	
	public int getW() {
		return w;
	}
	
	public int getH() {
		return h;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setI(String s) {
		URL url = getClass().getResource(s);
		try {
			i = ImageIO.read(url);
			this.i = i;
		} catch (IOException e) {
			System.out.println("RIP!");
		}
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	
	
}