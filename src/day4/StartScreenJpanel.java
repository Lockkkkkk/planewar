package day4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartScreenJpanel extends JPanel {
	Image pImg;
	public StartScreenJpanel(){
		try {
			pImg=ImageIO.read(new File("Image/bk22.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(pImg, -10, 0, null);
		Font f = new Font("华文新魏", Font.BOLD, 18);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("选择任意飞机开始游戏!", 50, 195);
		//System.out.println(1111);
	}
	
}