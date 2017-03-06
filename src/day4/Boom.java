package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Boom {
	int x,y;
	Image bImg;
	public Boom (int x, int y, Image bImg) {
		super();
		this.x = x;
		this.y = y;
		this.bImg = bImg;
	}

	public void drawBImg(Graphics g){
		g.drawImage(bImg, x, y, null);
	}
	
	public int bImgMove(){
		int i=0;
		y-=5;
		if(y<=0-bImg.getHeight(null))
				{i=1;}
		return i;
	}
}

	

