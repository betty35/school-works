import java.util.Date;


public class Exercise14_1 
{	public static void main(String[] args)
	{ Circle1 circle1 = new Circle1(5);
    Circle1 circle2 = new Circle1(7);

    Circle1 circle = (Circle1)GeometricObject.max(circle1, circle2);
    
    System.out.println("The larger circle's radius is " +
      circle.getRadius());
    System.out.println(circle);

    Rectangle1 r1=new Rectangle1(1,2);
    Rectangle1 r2=new Rectangle1(3,2);
    Rectangle1 r=(Rectangle1)GeometricObject.max(r1, r2);
    System.out.println("The bigger "+r.toString() );
    System.out.println(r);

	
	
	}

}

abstract class GeometricObject implements Comparable
{private String color;
private boolean filled;
private Date dateCreated;



GeometricObject()
{dateCreated=new Date();}

	GeometricObject(String color,boolean filled)
	{dateCreated=new Date();
	this.filled=filled;
	this.color=color;
	}

	public void setColor(String color)
	{this.color=color;}

	public String getColor()
	{return color;}

	public void setFilled(boolean filled)
	{this.filled=filled;}

	public boolean getFilled()
	{return filled;}

	public java.util.Date getDateCreated()
	{return dateCreated;}

	public abstract double getArea();

	public abstract double getPerimeter();


	public static GeometricObject max(GeometricObject a,GeometricObject b)
	{if(a.compareTo(b)>0)
		return a;
	else return b;
	}
}



class Circle1 extends GeometricObject
{private double radius;

	
	Circle1()
	{}

	Circle1(double radius)
	{this.radius=radius;}


	public double getRadius()
	{return radius;}

	public void setRadius(double radius)
	{this.radius=radius;}

	public double getArea() 
	{return radius*radius*Math.PI;}

	public double getPerimeter() 
	{return 2*radius*Math.PI;}

	public boolean equals(Circle1 circle) 
	{return this.radius == circle.getRadius();}

	public String toString() 
	{return "circle's radius is " + radius;}

	public int compareTo(Object o) 
	{if(this.getArea()>((Circle1)o).getArea())
		return 1;
	else if(this.getArea()==((Circle1)o).getArea())
		return 0;
	else return -1;
	}

}


class Rectangle1 extends GeometricObject
{private double height,width;

	Rectangle1(){}
	
	Rectangle1(double width,double height)
	{this.width=width;
	this.height=height;
	}
	
	public double getWidth()
	{return width;}
	
	public double getHeight()
	{return height;}
	
	public void setWidth(double width)
	{this.width=width;}
	
	public void setHeight(double height)
	{this.height=height;}

	
	public int compareTo(Object o) 
	{if(this.getArea()>((Rectangle1)o).getArea())
		return 1;
	else if (this.getArea()<((Rectangle1)o).getArea())
		return -1;
	else return 0;
	}

	public double getArea() 
	{return height*width;}

	public double getPerimeter() 
	{return (height+width)*2;}
	
	public boolean equals(Rectangle1 r)
	{return this.getArea()==r.getArea();}
	
	public String toString()
	{return "rectangle's width is "+width+
			" and it's height is "+height;}
}