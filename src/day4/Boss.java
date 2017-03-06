package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Boss {
	int x,y,direction,bosshp;
	Image bossImg;
	
	static final int direction_left=0;
	static final int direction_right=1;
	
	public Boss(int x, int y, int direction, int bosshp, Image bossImg) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.bosshp = bosshp;
		this.bossImg = bossImg;
	}
	
	public void drawBoss(Graphics g){
		g.drawImage(bossImg, x, y, null);
	}
	
	public void moveBoss(){
		switch (direction) {
		case direction_left:
			x-=1;
			if(x<=0) 
			direction=direction_right;
			break;
		case direction_right:
			x+=1;
			if(x+bossImg.getWidth(null)>=400)
			direction=direction_left;
			break;
		}
	}

}
