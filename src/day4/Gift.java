package day4;

import java.awt.Graphics;
import java.awt.Image;

public class Gift {
	//������ߵ����ꡢ�ٶȣ�
	int gx,gy,direction;
	Image gImage;
	
	//��ʼ��
	public Gift(int gx, int gy, Image gImage,int direction) {
		super();
		this.gx = gx;
		this.gy = gy;
		this.gImage = gImage;
		this.direction = direction;
	}
	//������
	public void drawGift(Graphics g){
		g.drawImage(gImage, gx, gy, null);
	}
	//����һ���������ڵ��ߵ��ƶ�
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
