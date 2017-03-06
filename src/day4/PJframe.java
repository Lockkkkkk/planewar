package day4;

import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.MemoryImageSource;

import javax.swing.JFrame;

public class PJframe extends JFrame implements ActionListener{
	PJpanel pjp=new PJpanel();
	public PJframe(){
		this.setTitle("·É»ú´óÕ½");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pjp.start();
		this.add(pjp);
		this.setBounds(100, 100, 400, 600);
		this.setVisible(false);
		this.hideCursor();
		pjp.jb.addActionListener(this);
		
	}
	public void hideCursor() {
		  Image image = Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(0, 0, new int[0], 0, 0));
		  this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), null));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pjp.jb)
		{
			this.setVisible(false);
			this.dispose();
			StartScreen ss=new StartScreen();
			ss.setVisible(true);
		}
	}


//	public static void main(String[] args) {
//		new PJframe();
//		// TODO Auto-generated method stub

	}


