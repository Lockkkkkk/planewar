package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Gift {
	//定义道具的坐标、速度；
	int gx,gy,direction;
	Image gImage;
	
	//初始化
	public Gift(int gx, int gy, Image gImage,int direction) {
		super();
		this.gx = gx;
		this.gy = gy;
		this.gImage = gImage;
		this.direction = direction;
	}
	//画道具
	public void drawGift(Graphics g){
		g.drawImage(gImage, gx, gy, null);
	}
	//定义一个方法用于道具的移动
	public void moveGift(){
		switch (direction) {
		case 0:
			gx++;
			gy++;
			break;
		case 1:
			gx--;
			gy++;
			break;

		default:
			break;
		}
	//	return i;
	}
}
