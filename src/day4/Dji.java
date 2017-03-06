package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Dji {
	int x1,y1;
	Image dImg;
	
	public Dji(int x1, int y1, Image dImg) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.dImg = dImg;
	}
	
	public void drawDImg(Graphics g){
		g.drawImage(dImg, x1, y1, null);
	}
	
	public void djiMove(){
		y1+=2;
	}
/*	public int DjiImgMove(){
		int i=0;
		y1+=5;
		return i;}*/
	

}
