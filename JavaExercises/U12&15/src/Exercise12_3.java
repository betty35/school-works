import java.awt.*;
import javax.swing.*;


public class Exercise12_3 
{	public static void main(String[] args)
	{GridLayout1 frame2=new GridLayout1();
	frame2.setVisible(true);
	frame2.pack();
	frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame2.setTitle("GridLayout for Exercise12_3");
	
	}

}


class GridLayout1 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridLayout1()
	{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	for(int i=1;i<=3;i++)
		{p1.add(new JButton("Button"+i));
		p2.add(new JButton("Button"+i));
		}
	p1.setLayout(new GridLayout(2,3,20,20));
	p2.setLayout(new GridLayout(2,3,20,20));
	setLayout(new FlowLayout(FlowLayout.CENTER,40,10));
	add(p1);
	add(p2);
	
	}
}