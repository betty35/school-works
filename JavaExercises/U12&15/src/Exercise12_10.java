import java.awt.*;
import javax.swing.*;

public class Exercise12_10 
{
	public static void main(String[] args)
	{CheckBoard frame=new CheckBoard();
	
	frame.setVisible(true);
	frame.setTitle("CheckBoard");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,400);
		
	}

}


class CheckBoard extends JFrame
{	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
JButton[][] block=new JButton[8][8];	
	
	public CheckBoard()
	{setLayout(new GridLayout(8,8,0,0));	
	for(int i=0;i<8;i++)
		{for(int j=0;j<8;j++)
			{block[i][j]=new JButton();
			if((i+j)%2==0) block[i][j].setBackground(Color.WHITE);
			else block[i][j].setBackground(Color.BLACK);
			add(block[i][j]);
			}
		}
	}
	
}