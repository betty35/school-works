import java.awt.*;
import javax.swing.*;

public class Exercise12_1 
{	public static void main(String[] args)
	{FlowLayout1 frame1=new FlowLayout1();
	frame1.setVisible(true);
	frame1.setTitle("FlowLayout");
	frame1.setLocationRelativeTo(null);
	frame1.pack();
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




class FlowLayout1 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlowLayout1()
	{setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
	JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
	JPanel p2=new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
	for(int i=1;i<=3;i++)
		{p1.add(new JButton("Button"+i));
		p2.add(new JButton("Button"+i));
		}
	add(p1);
	add(p2);
	}
}


