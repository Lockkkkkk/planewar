package main;

import java.awt.Graphics;
import java.awt.Image;

public class Huz {
		int hx,hy,direction;
		Image color3;
		public Huz(int hx, int hy, int direction, Image color3) {
			super();
			this.hx = hx;
			this.hy = hy;
			this.direction = direction;
			this.color3 = color3;
		}
		public void draw(Graphics g){
			g.drawImage(color3, hx, hy, null);
			
		}
		public void move(){
			switch (direction) {
			case 0:
				hx++;
				hy++;
				break;
			case 1:
				hx--;
				hy++;
				break;

			default:
				break;
			}
		}
}
