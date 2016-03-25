import java.awt.*;
import javax.swing.*;


public class Exercise15_12
{	public static void main(String[] args)
	{JFrame frame=new JFrame();
	DrawSine s1=new DrawSine();
	frame.add(s1);
	frame.setVisible(true);
	frame.setTitle("Sine");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(650,600);
	
	}

}


class DrawSine extends JPanel
{	public DrawSine()
	{}

	public void paintComponent(Graphics g)
	{super.paintComponent(g);
		
		int xCenter=getWidth();
		int yCenter=getHeight();
	//draw axis
		g.drawLine(300, 0, 300, 600);
		g.drawLine(0, 300, 600, 300);
	//draw arrow
		g.drawLine(290, 20, 300, 0);
		g.drawLine(310, 20, 300, 0);
		g.drawLine(580, 290, 600, 300);
		g.drawLine(580, 310, 600, 300);
		
	//draw sine
		Polygon p=new Polygon();
		for(int x=-200;x<=200;x++)
			p.addPoint(x+300, 300-(int)(100*Math.sin((x/200.0)*2*Math.PI)));
		g.drawPolygon(p);
		
	//draw pi and numbers	
		g.drawString("-2\u03c0",100,310);
		g.drawString("-\u03c0",200,310);
		g.drawString("0",290,310);
		g.drawString("\u03c0",400,310);
		g.drawString("2\u03c0",500,310);
		g.drawString("x",570,310);
		g.drawString("y",290,10);
	}
	
}
