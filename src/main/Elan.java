package main;

import java.awt.Graphics;
import java.awt.Image;

public class Elan {
	//����л������� �� �ٶ� ����ֵ  �÷�
	int ex,ey,espeed,hp,score;
	//�л���ͼƬ
	Image eImg;
	public Elan(int ex,int ey,int speed, int hp, Image eimg){
		super();
		this.ex=ex;
		this.ey=ey;
		this.espeed=espeed;
		this.hp=hp;
		this.eImg=eimg;
	}

	public void drawEimg(Graphics g)
	{
		g.drawImage(eImg, ex, ey, null);
	}
	public int moveEImg(){
		int i=0,espeed=3;
		ey+=espeed;
		return i;
	}

}


