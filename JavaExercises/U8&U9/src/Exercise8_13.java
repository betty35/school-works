import java.util.Scanner;
public class Exercise8_13 
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of rows and columns of the array:");
	int rows=input.nextInt();
	int columns=input.nextInt();
	System.out.println("Now enter the array:");
	double[][] a=new double[rows][columns];
	for(int i=0;i<rows;i++)
		{for(int j=0;j<columns;j++)
			a[i][j]=input.nextDouble();
		}
	Location find=Location.locateLargest(a);
	System.out.println("The location of the largest element is "+find.maxValue
			+" at ("+find.row+","+find.column+")");
	}

}


class Location
{public int row,column;
private boolean jump;
public double maxValue;
	public static Location locateLargest(double[][] a)
	{Location find=new Location();
		find.maxValue=a[0][0];
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<a[0].length;j++)
			if(a[i][j]>find.maxValue) find.maxValue=a[i][j];
		}
		for(int i=0;i<a.length;i++)
		{for(int j=0;j<a[0].length;j++)
			if(a[i][j]==find.maxValue) 
			{find.row=i;
			find.column=j;
			find.jump=true;
			break;
			}
		if(find.jump) break;
		}
	return find;
	}
}