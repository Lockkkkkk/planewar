package main;

import java.awt.Graphics;
import java.awt.Image;

public class Eboom {
	//����л���ը���꣬ͼƬ
int dx,dy;
Image eeimg;
public Eboom(int dx, int dy, Image eeimg) {
	super();
	this.dx = dx;
	this.dy = dy;
	this.eeimg = eeimg;
}
//���廭�л���ը�ķ���
public void drawEboom(Graphics g){
	g.drawImage(eeimg, dx, dy,100,100, null);
}
//����л���ը�ƶ��ķ���
public int moveEboom(Elan e1){
	int i=0;
	dy+=e1.espeed;
	return 0;
}
//����һ������ʹ�л���ը��ʧ
//public int destoryEboom(){
//	int i=0;
//  int time=0;
//  if(time==1)i=1;
//	return i;
//}
}
