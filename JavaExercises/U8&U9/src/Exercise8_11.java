import java.util.Scanner;
public class Exercise8_11 {
	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	double[] t=new double[6];
	System.out.print("Enter a,b,c,d,e,f for the equation:");
	for(int i=0;i<6;i++) t[i]=input.nextDouble();
	LinearEquation eq=new LinearEquation(t);
	System.out.println("Check: a=" +eq.getA()+"  b= "+eq.getB()+"  c= "+eq.getC()
			+"  d= "+eq.getD()+"  e="+eq.getE()+"  f="+eq.getF());
	if(eq.isSolvable()) 
		System.out.println("X= "+eq.getX()+"   Y= "+eq.getY());
	else
		System.out.println("No Solution!");
	}
}

class LinearEquation
{	private double[] a={1,1,1,1,1,1};
	private double devide=1.0;
	LinearEquation(double[] t)
	{for(int i=0;i<6;i++)
	a[i]=t[i];
	devide=a[0]*a[3]-a[1]+a[2];
	}
	
	public double getA()
	{return a[0];}
	
	public double getB()
	{return a[1];}
	
	public double getC()
	{return a[2];}
	
	public double getD()
	{return a[3];}
	
	public double getE()
	{return a[4];}
	
	public double getF()
	{return a[5];}
	
	public boolean isSolvable()
	{return devide!=0;}
	
	public double getX()
	{return (a[4]*a[3]-a[1]*a[5])/devide;}
	
	public double getY()
	{return (a[0]*a[5]-a[4]*a[2])/devide;}

}