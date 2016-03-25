//Financial application: computing future tuition
import java.util.Scanner;
public class EX47 
{public static void main(String[] args)
	{double tuition,total=0;int years;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the tuition of this year:");
	tuition=input.nextDouble();
	for(years=1;years<=10;years++)
		{System.out.println("Tuition for year "+years+" is "+(int)(tuition*100)/100.0 +"$.10");
		 tuition*=1.05;
		}
	for(years=10;years<=14;years++)
		{total+=tuition;
		tuition*=1.05;
		}
	System.out.println("Total tuition for 4 years start from ten years after now is "+
		(int)(total*100)/100.0 +"$.");
	}
	

}
