package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class PJpanel extends JPanel implements MouseMotionListener,MouseListener{
	
	int score=0;
	int px=200,py=500;
	int HP=500,mp=300;
	Boolean flag1=false;
	Boolean flag=false;
	Boolean bb=false;
	Boolean fb=false;
	Boolean fina=false;
	Image finaImg;
	Image bhImg;//������
	Image pImg;//Ӣ�ۻ�
	Image dImg;//�л���ʽ
	Image bImg;//�ӵ�ͼƬ
	Image ddImg;//���屬ըͼƬ
	Image boImage;
	Image sImg;//�������ӵ�
	Image bossImg;
	Image gImage;//����ͼƬ
	//����л���ը��ͼƬ
	Image eImg;
	//���屳��ͼƬ����
	Image bgImg;
	//����л��ӵ�ͼ��
	Image bbImg;
	Image BigImg;
	//���屳��ͼƬ����
	int x=0,y=-2400;
	JButton jb=new JButton("���¿�ʼ");
	//���췽����ɼ����ز�
	List<Boom> booms=new ArrayList<Boom>();
	List<Eboom>ebooms=new ArrayList<Eboom>();
	List<Elan> elans=new ArrayList<Elan>();
	List<ElanBullet>elanbullet=new ArrayList<ElanBullet>();
	List<Miss> miss=new ArrayList<Miss>();
	List<BossBullet>bossbullet=new ArrayList<BossBullet>();
	List<Boss>boss=new ArrayList<Boss>();
	List<Huz> huzs=new ArrayList<Huz>() ;
//	List<Gift>gifts=new ArrayList<Gift>();
	List<Big> big=new ArrayList<Big>();
	public PJpanel(){
		try {
			pImg=ImageIO.read(new File("Image/yxj1.png"));//���Ƶķɻ�
			bgImg=ImageIO.read(new File("Image/bg.png"));//����
			bImg=ImageIO.read(new File("Image/z11.png"));//�ӵ�
			bbImg=ImageIO.read(new File("Image/bullet3456.png"));
			//ddImg=ImageIO.read(new File("Image/bonus.png"));//��ʧ����
		    boImage=new ImageIcon("Image/bullet.png").getImage();//boss�ӵ�
			bossImg=new ImageIcon("Image/boss666.png").getImage();//BOssͼƬ
			bhImg=ImageIO.read(new File("Image/111.png"));//������ͼƬ
			sImg=ImageIO.read(new File("Image/222.png"));//����1��ͼƬ
			eImg=ImageIO.read(new File("Image/bd2.png"));//�л���ը
			gImage=ImageIO.read(new File("Image/bd8.png"));//����2��ͼƬ
			BigImg=new ImageIcon("Image/texia.png").getImage();//����ͼƬ
			finaImg=new ImageIcon("Image/561.jpg").getImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);
		jb.setBounds(250, 500,100,40);
		this.add(jb);
		System.out.println(1111);
		jb.setVisible(false);
		addMouseMotionListener(this);
		addMouseListener(this);
		
	}
//	//ʵ�ֻ��ķ���
//	@Override
//	public void paint(Graphics g) {
//		super.paint(g);
//		g.drawImage(bgImg, x, y, null);//����
//		g.drawImage(pImg, px, py, null);//�Լ����Ƶķɻ�
//		//���ӵ�
//		for (int i = 0; i < booms.size(); i++) {
//			Boom boom=booms.get(i);
//			boom.drawBImg(g);
//		}
//		//���л�
//		for (int i = 0; i < elans.size(); i++) {
//			Elan elan=elans.get(i);
//			elan.drawEimg(g);
//		}
//		//���л��ӵ�
//		for (int i = 0; i < elanbullet.size(); i++) {
//			ElanBullet eb=elanbullet.get(i);
//			eb.drawBImg(g);
//		}
//		//��ʧ����
//        for (int i = 0; i < ebooms.size(); i++) {
//			Eboom bm=ebooms.get(i);
//			bm.drawEboom(g);		
//		}
//		 //��boss
//		for (int i = 0; i < boss.size(); i++) {
//			Boss bs=boss.get(i);
//			bs.drawBoss(g);
//		}
//		//��BOSS�ӵ�
//		for (int i = 0; i <bossbullet .size(); i++) {
//			BossBullet bob=bossbullet.get(i);
//			bob.drawBossBoom(g);
//		}
//		//������
//			if(flag1==true){
//			g.drawImage(bhImg, px+1, py, null);
//			}
//		//������
//			for (int i= 0; i < huzs.size(); i++) {
//			Huz huz1=huzs.get(i);
//			huz1.draw(g);
//				}
//		//������
//			for (int i = 0; i < big.size(); i++) {
//				Big bg=big.get(i);
//				bg.drawBig(g);
//			}
////		//������
////			for (int i = 0; i < gifts.size(); i++) {
////			Gift gt=gifts.get(i);
////			gt.drawGift(g);
////			}
//		
//		//System.out.println(elans.size());
//		//�÷�
//        //Graphics2D g2=(Graphics2D)g;
//		Font F1=new Font("������", Font.BOLD,15);
//		g.setFont(F1);
//		g.setColor(Color.red);
//		g.drawString("�÷֣�"+score, 5, 50);
//		g.drawString("����:"+mp, 5, 80);
//		g.drawString("��ǰ������"+HP, 5, 100);
//		//Ѫ��
//		g.setColor(Color.green);
//		g.drawLine(0, 25, 400, 25);
//		g.drawLine(0, 0, 0, 25);
//		g.drawLine(400, 0, 400, 25);
//		g.drawLine(0, 0, 400, 0);
//		Graphics2D g2=(Graphics2D) g;
//		g2.setStroke(new BasicStroke(40));
//		g2.setColor(Color.green);
//	//	g2.setColor(new Color(0F,1.0F, 0F,0.65F));
//		g2.drawLine(-15,5,HP-100,5);
//		if(flag){
//			Font F=new Font("������", Font.BOLD,70);
//			g.setFont(F);
//			g.setColor(Color.red);
//			g.drawString("GameOver", 45,300);
//			Font F2=new Font("��Բ", Font.BOLD, 20);
//			g.setFont(F2);
//			g.setColor(Color.white);
//			g.drawString("���ĵ÷�Ϊ:"+score, 120, 330);
//			jb.setVisible(true);
//		}
//	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(bgImg, x, y, null);//����
		g.drawImage(pImg, px, py, null);//�Լ����Ƶķɻ�
		//���ӵ�
		for (int i = 0; i < booms.size(); i++) {
			Boom boom=booms.get(i);
			boom.drawBImg(g);
		}
		//���л�
		for (int i = 0; i < elans.size(); i++) {
			Elan elan=elans.get(i);
			elan.drawEimg(g);
		}
		//���л��ӵ�
		for (int i = 0; i < elanbullet.size(); i++) {
			ElanBullet eb=elanbullet.get(i);
			eb.drawBImg(g);
		}
		//��ʧ����
        for (int i = 0; i < ebooms.size(); i++) {
			Eboom bm=ebooms.get(i);
			bm.drawEboom(g);		
		}
		 //��boss
		for (int i = 0; i < boss.size(); i++) {
			Boss bs=boss.get(i);
			bs.drawBoss(g);
		}
		//��BOSS�ӵ�
		for (int i = 0; i <bossbullet .size(); i++) {
			BossBullet bob=bossbullet.get(i);
			bob.drawBossBoom(g);
		}
		//������
			if(flag1==true){
			g.drawImage(bhImg, px+1, py, null);
			}
		//������
			for (int i= 0; i < huzs.size(); i++) {
			Huz huz1=huzs.get(i);
			huz1.draw(g);
				}
		//������
			for (int i = 0; i < big.size(); i++) {
				Big bg=big.get(i);
				bg.drawBig(g);
			}
//		//������
//			for (int i = 0; i < gifts.size(); i++) {
//			Gift gt=gifts.get(i);
//			gt.drawGift(g);
//			}
		
		//System.out.println(elans.size());
		//�÷�
        //Graphics2D g2=(Graphics2D)g;
		Font F1=new Font("������", Font.BOLD,15);
		g.setFont(F1);
		g.setColor(Color.red);
		g.drawString("�÷֣�"+score, 5, 50);
		g.drawString("����:"+mp, 5,70);
		//g.drawString("��ǰ������"+HP, 5, 100);
		//Ѫ��
		g.setColor(Color.green);
		g.drawLine(0, 25, 400, 25);
		g.drawLine(0, 0, 0, 25);
		g.drawLine(400, 0, 400, 25);
		g.drawLine(0, 0, 400, 0);
		Graphics2D g2=(Graphics2D) g;
		g2.setStroke(new BasicStroke(40));
		g2.setColor(Color.green);
	//	g2.setColor(new Color(0F,1.0F, 0F,0.65F));
		g2.drawLine(-15,5,HP-100,5);
		if(flag){
			Font F=new Font("������", Font.BOLD,70);
			g.setFont(F);
			g.setColor(Color.red);
			g.drawString("GameOver", 45,300);
			Font F2=new Font("��Բ", Font.BOLD, 20);
			g.setFont(F2);
			g.setColor(Color.white);
			g.drawString("���ĵ÷�Ϊ:"+score, 120, 330);
			jb.setVisible(true);
		}
		if(fina){
			g.drawImage(finaImg, 0, 0, null);
		}
	}
	//����һ���������ڶ��߳�
	int count=0,ccount=0;
	int time=500;
	public void start(){
		Thread t= new Thread(){
			public void run(){
				while(true){
					y++;//���������ƶ�
					if(y==0) {y=-2400;ccount++;System.out.println(ccount);}
					count++;
					time--;
					if(count==Integer.MAX_VALUE) count=0;
					//���������
					if(time <500&&time>0){
						flag1=true;	
					}
					else flag1=false;
					//�ɻ�������
					for (int i = 0; i < huzs.size(); i++) {
						Huz huz=huzs.get(i);
						huz.move();
						if(huz.hx+sImg.getWidth(null)/4<=px+pImg.getWidth(null)/2&&huz.hx+sImg.getWidth(null)*3/4>=px+pImg.getWidth(null)/2&&huz.hy+sImg.getHeight(null)/4<=py+pImg.getHeight(null)/2&&huz.hy+sImg.getHeight(null)*3/4>=py+pImg.getHeight(null)/2){
							huzs.remove(i);
							time=500;
						}
					}
					//����boss
					if(y==-200){
						Boss bs=new Boss(100, 10, (int)(Math.random()*2), 40, bossImg);
						boss.add(bs);
						fb=true;
						System.out.println(11111);
					}
					//boss�ӵ�
					if(fb){
					if(count%60==0){
						for (int i = 0; i < boss.size(); i++) {
							Boss b=boss.get(i);
							BossBullet bob1=new BossBullet(b.x+bossImg.getWidth(null)/2, b.y+bossImg.getHeight(null)/2,1,boImage);
							bossbullet.add(bob1);
							BossBullet bob2=new BossBullet(b.x+bossImg.getWidth(null)/2-50, b.y+bossImg.getWidth(null)/2-5, 1,boImage);
							bossbullet.add(bob2);
							BossBullet bob3=new BossBullet(b.x+bossImg.getWidth(null)/2+40, b.y+bossImg.getWidth(null)/2-5, 1, boImage);
							bossbullet.add(bob3);
						}
					}
					//boss�ӵ��ƶ�
					for (int i = 0; i < bossbullet.size(); i++) {
						BossBullet b=bossbullet.get(i);
						int a=b.moveBoBullet();
						int c=b.moveBosBullet();
						int d=b.moveBossBullet();
						if(a==1||c==1||d==1){
							bossbullet.remove(i);
							break;
						}
					}}
					//��������
//					if(count%600==0){
//						Gift gt=new Gift((int)(Math.random()*350), (int)(Math.random()*350), gImage,1);
//						gifts.add(gt);
//					}
					//�����һ����ڵ�
					if(count%12==0){
						Boom bo=new Boom(px+pImg.getWidth(null)/2-13, py+pImg.getHeight(null)/2-35,  bImg );
						booms.add(bo);
					}
					//�����л��ڵ�
					if(count%100==0){
						for (int i = 0; i < elans.size(); i++) {
							Elan elan=elans.get(i);	
							ElanBullet eb=new ElanBullet(elan.ex+bbImg.getWidth(null)+8, elan.ey+bbImg.getHeight(null), bbImg);
							elanbullet.add(eb);
						}
					}
					if(count%200==0){
						for (int i = 0; i < elans.size(); i++) {
							Elan elan=elans.get(i);	
							ElanBullet eb=new ElanBullet(elan.ex+bbImg.getWidth(null), elan.ey+bbImg.getHeight(null), bbImg);
							elanbullet.add(eb);
						}
					}
					//�������������ĵл�
					if(count%60==0||count%100==0){
						int num=(int)(Math.random()*5+2);
						 dImg=new ImageIcon("Image/e"+num+".png").getImage();
						Elan eland=new Elan((int)(Math.random()*350),-50,num,num,dImg);
						elans.add(eland);
					}
					//�ƶ�����
					for (int i = 0; i <big.size(); i++) {
						Big bullet3=big.get(i);
						int d3=bullet3.moveBig();
						if(d3==1){big.remove(i);break;}
					}
					
					//ʹ�л��ƶ�
					for (int i = 0; i < elans.size(); i++) {
						Elan elan=elans.get(i);				
						int d=elan.moveEImg();
						if(d==1){
							elans.remove(i);
							break;
						}
					}
					//ʹboss�ƶ�
					for (int i = 0; i < boss.size(); i++) {
						Boss bs=boss.get(i);
						bs.moveBoss();
					}
					//boss�ӵ�
					for (int i = 0; i < bossbullet.size();i++) {
						BossBullet bob=bossbullet.get(i);
						bob.moveBoBullet();
						bob.moveBossBullet();
					}
					//BOSS������
					for (int i = 0; i < boss.size(); i++) {
						for (int j = 0; j <booms.size(); j++) {
							Boss bs=boss.get(i);
							Boom b=booms.get(j);
							if(b.x<=bs.x+bossImg.getWidth(null)&&b.y<=bs.y+bossImg.getHeight(null)&&b.x>=bs.x&&b.y>=bs.y)
							{
								booms.remove(j);
								score++;
								bs.bosshp--;
								if(bs.bosshp==0){
									boss.remove(i);
									score=score+500;
									fina=true;
									break;
								}
							}
						}
					}
					
					//�ӵ������ɻ�֮���������ӷ�
					for (int i = 0; i < elans.size(); i++) {
						for (int j = 0; j <booms.size(); j++) {
							final Elan d=elans.get(i);
							Boom b=booms.get(j);
							if(b.x<=d.ex+dImg.getWidth(null)&&b.y<=d.ey+dImg.getHeight(null)&&b.x>=d.ex&&b.y>=d.ey)
							{
								elans.remove(i);
								booms.remove(j);
								mp+=10;
								score++;
								bb=true;
								//��ӱ�ը����ʧ
	                               new  Thread(){
									public void run(){
										try {
											Eboom eboom=new Eboom(d.ex, d.ey, eImg);
									        ebooms.add(eboom);
											Thread.sleep(300);
	                                         ebooms.remove(eboom);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
								}
							}.start();
							
				//�����ɻ��󱬳�����
								int jl=(int)(Math.random()*0.5+0.6);
								int dir=(int)(Math.random()*2);
								if(jl==1){
								Huz huz=new Huz(d.ex, d.ey, dir, sImg);
								huz.move();
								huzs.add(huz);}
								
//								//�����ƶ�
//								for (int k = 0; k < gifts.size(); k++) {
//									 final Gift gt=gifts.get(k);
//										gt.moveGift();
//										if(gt.gx+gImage.getWidth(null)/4<=px+pImg.getWidth(null)/2&&gt.gx+gImage.getWidth(null)*3/4>=px+pImg.getWidth(null)/2&&gt.gy+gImage.getHeight(null)/4<=py+pImg.getHeight(null)/2&&gt.gy+gImage.getHeight(null)*3/4>=py+pImg.getHeight(null)/2){
//											huzs.remove(i);}
//
////										int d1=gt.moveGift();
////										if(d1==1)
////										{gifts.remove(k);
//										break;}
//									
//								
//								//�Ե��ߺ��Ѫ
//		                      if(px+pImg.getWidth(null)>=gt.gx&&px<=gt.gx+gImage.getWidth(null)){
//		                    	  if(py+pImg.getHeight(null)/2>=gt.gy&&py<=gt.gy+gImage.getHeight(null)){
//		                    		  gifts.remove(gt);
//														HP+=10;
//														break;}}
//								}
							
				   //�ӵ�����
								while(score>20){
									bImg=new ImageIcon("Image/z13.png").getImage();
									break;
								}
								while(score>50)
								{
									bImg=new ImageIcon("Image/z2.png").getImage();
								break;
								}
								break;
							}
						}
					}
					//���е��˺�Ч�� ����л����ӵ�
					for (int i = 0; i <elans.size(); i++) {
						for (int j = 0; j <big.size(); j++) {
							for (int k = 0; k < elanbullet.size(); k++) {
									Elan elan=elans.get(i);
									Big bullet3=big.get(j);
									ElanBullet eb=elanbullet.get(k);
									if(bullet3.x>=elan.ex-bullet3.width&&bullet3.x<=elan.ex+elan.eImg.getWidth(null)){
										if(bullet3.y<=elan.ey+elan.eImg.getHeight(null)&&bullet3.y>=elan.ey-bullet3.width){
											elans.remove(i);
											elanbullet.remove(k);
											if(fb=true){
												for (int l = 0; l < bossbullet.size(); l++) {
													BossBullet bb=bossbullet.get(l);
													bossbullet.remove(l);
												}
											}
											//bossbullet.remove(l);										
											break;
							}
								}
							}
						}
					}
					//�ҷ��ɻ������ӵ���HP����ֱ������
					for (int i = 0; i < elanbullet.size(); i++) {
						ElanBullet eb=elanbullet.get(i);
				//׷���ӵ�
						int mn=px;
						//if(y>-5600){
//							if(eb.x>mn)   eb.x--;
//							else    eb.x++;
					//}
						if(eb.x+bImg.getWidth(null)>=px&&eb.x<=px+pImg.getWidth(null)&&eb.y+bImg.getHeight(null)>=py&&eb.y<=py+pImg.getHeight(null)){
							elanbullet.remove(i);
							if(flag1==false)
							{
							HP-=10;break;
							}
//							HP-=10;

						}
					}
					//BOSS�ӵ��е�
					for (int i = 0; i < bossbullet.size(); i++) {
						BossBullet bs=bossbullet.get(i);
						if(bs.x+bossImg.getWidth(null)>=px&&bs.x<=px+pImg.getWidth(null)&&bs.y+boImage.getHeight(null)>=py&&bs.y<=py+pImg.getHeight(null)){
							bossbullet.remove(i);
							if(flag1==false)
							{
							HP-=20;break;
							}
					
						}
					}
					//�ҷ��ɻ������л����20Ѫ
					for (int i = 0; i < elans.size(); i++) {
						Elan d=elans.get(i);
						{
							if(d.ex+dImg.getWidth(null)>=px&&d.ex<=px+pImg.getWidth(null)&&d.ey+dImg.getHeight(null)>=py&&d.ey<=py+pImg.getHeight(null))
							{
								if(flag1==false)
								{
								HP-=20;
								elans.remove(i);
								}
						}}
					}
				//�ҷ��ӵ��ƶ�
					for (int i = 0; i < booms.size(); i++) {
						Boom boom=booms.get(i);
						int d=boom.bImgMove();
						if(d==1){
							booms.remove(i);
							break;
						}
					}
					
					//�л��ӵ��ƶ�
					for (int i = 0; i < elanbullet.size(); i++) {
						ElanBullet el=elanbullet.get(i);
						int d=el.BBImgMove();
						if(d==1){
							elanbullet.remove(i);
							break;
						}
					}
					if(HP<=0){
						HP=0;
					flag=true;
					repaint();
					this.stop();
					break;
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		px=e.getX()-pImg.getWidth(null)/2;
		py=e.getY()-pImg.getHeight(null)/2;
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		px=e.getX()-pImg.getWidth(null)/2;
		py=e.getY()-pImg.getHeight(null)/2;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(mp>=50){
		Big bg=new Big(px+pImg.getWidth(null)/2-mp/2,py,mp,BigImg);
		big.add(bg);
		mp=0;}
		//System.out.println("11");
		
	}
	//public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource()==jb)
//		{
//			this.setVisible(false);
//			StartScreen ss=new StartScreen();
//			ss.setVisible(true);
//		}
	}


//	public void actionPerformed(ActionEvent arg0) {
//		// TODO Auto-generated method stub
//		this.start();
//	}


