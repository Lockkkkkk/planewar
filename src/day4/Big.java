package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Big {
	int x,y,width;
	Image BigImg;
	public Big(int x, int y, int width, Image BigImg) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.BigImg = BigImg;
	}
	public void drawBig(Graphics g){
		g.drawImage(BigImg, x, y,width,width, null);
		}
	public int moveBig(){
		int i=0;
		y-=10;
		if(y<=-BigImg.getHeight(null)) {i=1;}
		return i;
	}
}
