package main;

import java.awt.Graphics;
import java.awt.Image;

public class Miss {
	int x ,y;
	Image ddImg;
	
	public Miss(int x ,int y,Image ddImg){		
		super();
		this.x=x;
		this.y=y;
		this.ddImg=ddImg;
	}
	public void drawddImg(Graphics g){
		g.drawImage(ddImg, x, y, null);
	}

}
