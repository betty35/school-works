import java.util.Scanner;

public class Exercise8_1
{
	//Main method
		public static void main(String[] args)
		{
			//����һ��Ĭ�ϳ���ĳ�����
			Rectangle rectangle1=new Rectangle();
			System.out.println("The area of rectagle of width:"+
			rectangle1.width+", height:"+rectangle1.height+" is "+
					rectangle1.getArea(rectangle1.width,rectangle1.height)+"\n And its'perimiter is "
					+rectangle1.getPerimeter(rectangle1.width,rectangle1.height));
			//����һ���Զ�����ĳ�����
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
{//���Ϳ�
	double width=1,height=1;
//�������
	private int numberOfObjects=0;
//�޲�������Ĭ�ϳ����Σ���=1����=1
	Rectangle(){numberOfObjects++;}
//�в��������ض�������
	Rectangle(double width1,double height1)
	{width=width1;
	height=height1;
	numberOfObjects++;
	}

	//�������
	public double getArea(double width,double height)
	{return width*height;
	}
	
	//�����ܳ�
	public double getPerimeter(double width,double height)
	{return (width+height)*2;
	}
	
	public int getNumberOfObjects()
	{return numberOfObjects;}

}

