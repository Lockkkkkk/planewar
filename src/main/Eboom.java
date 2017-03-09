package main;

import java.awt.Graphics;
import java.awt.Image;

public class Eboom {
	//定义敌机爆炸坐标，图片
int dx,dy;
Image eeimg;
public Eboom(int dx, int dy, Image eeimg) {
	super();
	this.dx = dx;
	this.dy = dy;
	this.eeimg = eeimg;
}
//定义画敌机爆炸的方法
public void drawEboom(Graphics g){
	g.drawImage(eeimg, dx, dy,100,100, null);
}
//定义敌机爆炸移动的方法
public int moveEboom(Elan e1){
	int i=0;
	dy+=e1.espeed;
	return 0;
}
//定义一个方法使敌机爆炸消失
//public int destoryEboom(){
//	int i=0;
//  int time=0;
//  if(time==1)i=1;
//	return i;
//}
}
