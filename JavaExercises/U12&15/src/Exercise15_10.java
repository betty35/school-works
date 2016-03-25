import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;


public class Exercise15_10 
{	public static void main(String[] args)
	{JFrame frame=new JFrame();
	DrawCylinder c1=new DrawCylinder();
	frame.add(c1);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Cylinder");
	frame.setSize(500,600);
	
	}

}


class DrawCylinder extends JPanel
{	
	
	DrawCylinder()
	{}
	
	public void paintComponent(Graphics g)
	{super.paintComponent(g);
	
	int xCenter=getWidth()/2;
	int yCenter=getHeight()/2;
	
	g.setColor(Color.BLACK);
	g.drawOval(xCenter-200, yCenter-250, 400, 200);
	g.drawArc(xCenter-200, yCenter+50, 400, 200, 180, 180);
	for(int i=0;i<10;i++)
	g.drawArc(xCenter-200, yCenter+50, 400, 200, i*18, 9 );
	g.drawLine(xCenter-200, yCenter-150, xCenter-200, yCenter+150);
	g.drawLine(xCenter+200, yCenter-150, xCenter+200, yCenter+150);
	
	}
	
}