package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Baohuzhao {
int x,y;
Image tt;



public Baohuzhao(int x, int y, Image tt) {
	super();
	this.x = x;
	this.y = y;
	this.tt = tt;
}



public void draw(Graphics q){
	q.drawImage(tt, x, y, null);
}


}
