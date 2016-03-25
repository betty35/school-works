import java.util.Scanner;

public class Exercise8_1
{
	//Main method
		public static void main(String[] args)
		{
			//建立一个默认长宽的长方形
			Rectangle rectangle1=new Rectangle();
			System.out.println("The area of rectagle of width:"+
			rectangle1.width+", height:"+rectangle1.height+" is "+
					rectangle1.getArea(rectangle1.width,rectangle1.height)+"\n And its'perimiter is "
					+rectangle1.getPerimeter(rectangle1.width,rectangle1.height));
			//建立一个自定长款的长方形
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the width and height of this rectangle:");
			double width1=input.nextDouble();
			double height1=input.nextDouble();
			Rectangle rectangle2=new Rectangle(width1,height1);
			System.out.println("The area of rectagle of width:"+
					rectangle2.width+", height:"+rectangle2.height+" is "+
							rectangle2.getArea(rectangle2.width,rectangle2.height)+"\n And its'perimiter is "
							+rectangle2.getPerimeter(rectangle2.width,rectangle2.height));
		}
}

class Rectangle 
{//长和宽
	double width=1,height=1;
//对象个数
	private int numberOfObjects=0;
//无参数建立默认长方形，长=1，宽=1
	Rectangle(){numberOfObjects++;}
//有参数建立特定长方形
	Rectangle(double width1,double height1)
	{width=width1;
	height=height1;
	numberOfObjects++;
	}

	//计算面积
	public double getArea(double width,double height)
	{return width*height;
	}
	
	//计算周长
	public double getPerimeter(double width,double height)
	{return (width+height)*2;
	}
	
	public int getNumberOfObjects()
	{return numberOfObjects;}

}

