//Printing numbers in a pyramid pattern
public class EX419 
{public static void main(String[] args)
	{int lines,tabs,items;
	for(lines=1;lines<=8;lines++)
		{for(tabs=8-lines+1;tabs>=1;tabs--) System.out.print("\t");
		 for(items=1;items<=lines;items++) System.out.print((int)Math.pow(2,items-1)+"\t");
		 for(items=lines-1;items>=1;items--) System.out.print((int)Math.pow(2,items-1)+"\t");
		 System.out.print("\n");
		 }
	}

}
