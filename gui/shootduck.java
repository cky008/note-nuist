package eventdriven;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import java.awt.*;
public class shootduck {
	static int ns=0;
	public static void main(String[] args) throws InterruptedException {
		
		JPanel p=new JPanel();
		JButton b=new JButton(new ImageIcon("C:\\Pictures\\duck.jpg"));
		JLabel l=new JLabel("Num of shooting: "+Integer.toString(ns));
		JFrame f=new JFrame("shoot the duck");
		f.setSize(600,600);
		f.setLocation(200,50);
		f.setVisible(true);
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.add(l, BorderLayout.SOUTH );
		f.add(p);
		p.add(b);
		p.setLayout(null);
		b.setSize(50,50);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ns++;
				l.setText("Num of shooting: "+Integer.toString(ns));
			}});

		Random r = new Random(1000);
		while(true)
		{
			Thread.sleep(1000);
			b.setLocation(r.nextInt(550),r.nextInt(550));
		}
		
		
	}
}
