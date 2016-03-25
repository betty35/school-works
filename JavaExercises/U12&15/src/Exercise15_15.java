import java.awt.*;
import javax.swing.*;

public class Exercise15_15 
{	public static void main(String[] args)
	{JFrame frame=new JFrame();
	ShowPieChart piechart=new ShowPieChart();
	frame.setVisible(true);
	frame.setTitle("Pie Chart");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(piechart);
	frame.setSize(280,280);
	
	}

}


class ShowPieChart extends JPanel
{
	public void paintComponent(Graphics g)
	{super.paintComponent(g);
	//draw filled arcs
	g.setColor(Color.RED);
	g.fillArc(20, 20, 200, 200, 0, (int)(20/100.0*360));
	g.setColor(Color.BLUE);
	g.fillArc(20, 20, 200, 200, (int)(20/100.0*360), (int)(10/100.0*360));
	g.setColor(Color.GREEN);
	g.fillArc(20, 20, 200, 200, (int)(30/100.0*360), (int)(30/100.0*360));
	g.setColor(Color.ORANGE);
	g.fillArc(20, 20, 200, 200, (int)(60/100.0*360), (int)(40/100.0*360));
	
	//write words
	g.setColor(Color.BLACK);
	g.drawString("Projects 20%", 160, 100);
	g.drawString("Quizzes 10%", 90 , 20);
	g.drawString("Midterm 30%",10,100);
	g.drawString("Final Exam 40%", 100, 200);
	
	}
}

