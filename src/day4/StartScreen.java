package day4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.peer.LightweightPeer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartScreen extends JFrame implements ActionListener {
	Image pImg;
	int x=400,y=600;
	JButton jb1,jb2,yxj1,yxj2,yxj3;
	public StartScreen(){
		yxj1=new JButton();
		yxj2=new JButton();
		yxj3=new JButton();
		yxj1.setPreferredSize(new Dimension(80, 20)); 
		yxj2.setPreferredSize(new Dimension(80, 20)); 
		yxj3.setPreferredSize(new Dimension(80, 20)); 
		ImageIcon icon1=new ImageIcon("Image/yxj1.png");
		ImageIcon icon2=new ImageIcon("Image/yxj2.png");
		ImageIcon icon3=new ImageIcon("Image/yxj3.png");
		yxj1.setIcon(icon1); 
		yxj2.setIcon(icon2); 
		yxj3.setIcon(icon3); 
		yxj1.setContentAreaFilled(false); 
		yxj2.setContentAreaFilled(false); 
		yxj3.setContentAreaFilled(false); 
		//pImg=new ImageIcon("Image/bk2011.jpg").getImage();
		jb2=new JButton("ÍË³öÓÎÏ·");
		jb2.setBounds(180,320,100,30);
		yxj3.setBounds(190,220,50,50);
		yxj1.setBounds(50, 220, 50, 50);
		yxj2.setBounds(120,220,50,50);
		add(jb2);add(yxj1);add(yxj2);add(yxj3);
     	this.setBounds(300, 200, 300, 400);
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		StartScreenJpanel ssj =new StartScreenJpanel();
		this.add(ssj);
	    jb2.addActionListener(this);
	    yxj1.addActionListener(this);
	    yxj2.addActionListener(this);
	    yxj3.addActionListener(this);
	    this.setVisible(true);
	}
	public static void main(String[] args) {
		new StartScreen();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==yxj1)
		{
			PJframe pjf=new PJframe();
			pjf.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		if(e.getSource()==yxj2)
		{
			PJframe1 pjf1=new PJframe1();
			pjf1.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		if(e.getSource()==yxj3)
		{
			PJframe2 pjf2=new PJframe2();
			pjf2.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		if(e.getSource()==jb2)
		{
			System.exit(0);
		}
	}
}
