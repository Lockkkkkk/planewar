package day4;
import java.awt.Graphics;
import java.awt.Image;

public class ElanBullet {
	int x,y;
	Image bbImg;
		public ElanBullet (int x, int y, Image bbImg) {
			super();
			this.x = x;
			this.y = y;
			this.bbImg = bbImg;
		}

		public void drawBImg(Graphics g){
			g.drawImage(bbImg, x, y, null);
		}
		
		public int BBImgMove(){
			int i=0;
			int speed=(int)(Math.random()*3);
			y+=6;
			if(y<=0-bbImg.getHeight(null))
					{i=1;}
			return i;
		}
	}

		


