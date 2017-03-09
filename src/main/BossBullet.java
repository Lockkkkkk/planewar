package main;

import java.awt.Graphics;
import java.awt.Image;

public class BossBullet {
	int x,y,bossspeed;
	Image boImage;
	public BossBullet(int x, int y, int bossspeed, Image boImage) {
		super();
		this.x = x;
		this.y = y;
		this.bossspeed = bossspeed;
		this.boImage = boImage;
	}
	
	public void drawBossBoom(Graphics g){
		g.drawImage(boImage, x, y, null);
	}
	
	public int moveBossBullet(){
		int i=0;
		y+=bossspeed;
		if(y>=600){
			i=1;;
		}
		return i;
	}
	public int moveBosBullet(){
		int i=0;
		x+=6;
		y+=bossspeed;
		if(y>=600){
			i=1;;
		}
		return i;
	}
	public int moveBoBullet(){
		int i=0;
		x-=3;
		y+=bossspeed;
		if(y>=600){
			i=1;
		}
		return i;
	}

}

