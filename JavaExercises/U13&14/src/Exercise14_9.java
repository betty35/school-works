import java.util.Date;


public class Exercise14_9 
{	public static Object max(Comparable[] a)
	{Comparable m=a[0];
	for(int i=1;i<a.length;i++)
		if(m.compareTo(a[i])<0) m=a[i];
	return m;
	}


	public static void main(String[] args)
	{String[] st={"blue","red","yellow","white","green",
			"purple","black","pink","orange","brown"};
	
	Integer[] ints=new Integer[10];
	for(int i=0;i<10;i++)
		ints[i]=new Integer((int)(Math.random()*200));
	
	Date[] dates=new Date[10];
	for(int i=0;i<10;i++)
		dates[i]=new Date();
	
	System.out.println("All 10 strings are:");
	for(int i=0;i<st.length;i++)
		System.out.print(st[i]+" ");
	System.out.println("");
	System.out.println("And the largest of them is "+ max(st));
	
	System.out.println("All 10 integers are:");
	for(int i=0;i<ints.length;i++)
		System.out.print(ints[i]+" ");
	System.out.println("");
	System.out.println("And the largest of them is "+ max(ints));
	
	
	System.out.println("All 10 dates are:");
	for(int i=0;i<dates.length;i++)
		{System.out.print(dates[i]+" ");
		if(i%3==0) System.out.println("");
		}
	System.out.println("");
	System.out.println("And the largest of them is "+ max(dates));
		
	}
}

