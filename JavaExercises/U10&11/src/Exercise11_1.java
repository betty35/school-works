
public class Exercise11_1 
{	public static void main(String[] args)
	{Triangle t1= new Triangle(1,1.5,1);
	t1.setColor("yellow");
	t1.setFilled(true);
	System.out.println("Color: "+ t1.getColor()+ 
			"   Filled: " + t1.isFilled());
	System.out.println(t1.toString());
	System.out.println("Area=" + (int)(t1.getArea()*1000)/1000.0 + 
			"   Perimiter:" + t1.getPerimeter());
	}

}

class Triangle extends GeometricObject
{
	private double side1=1.0,side2=1.0,side3=1.0;
	
	public Triangle()
	{}
	
	public Triangle(double side1, double side2, double side3)
	{this.side1=side1;
	this.side2=side2;
	this.side3=side3;
	}
	
	public double getSide(int i)
	{if(i==1) return side1;
	else if(i==2) return side2;
	else if(i==3) return side3;
	else 
		{System.out.println("A triangle has only 3 sides!");
		return -1;
		}	
	}
	
	public double getArea()
	{double p=(side1+side2+side3)/2;
	 return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));		
	}
	
	public double getPerimeter()
	{return side1+side2+side3;}
	
	public String toString()
	{return "Triangle: "+ "side1: "+ side1 +
			"    side2: " + side2 + "   side3: " + side3;
	}
}