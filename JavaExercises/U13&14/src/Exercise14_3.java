
public class Exercise14_3 
{	public static void main(String[] args)
	{GeometricObject[] sq={new Square(1),new Square(2),new Square(3)};
    for(int i=0;i<sq.length;i++)
    	{ if(sq[i] instanceof Colorable)
          ((Colorable)sq[i]).howToColor();
    	}
    }
}




interface Colorable
{public void howToColor();}




class Square extends GeometricObject implements Colorable
{double side;

	public Square(){};

	public Square(double side)
	{super();
	this.side=side;
	}

	public double getArea()
	{return side*side;}
	
	public double getPerimeter() 
	{return side*4;}
	
	public void howToColor()
	{System.out.println("Color all four sides.");}

	public double getSide()
	{return side;}
	
	public void setSide(double side)
	{this.side=side;}
	
	public int compareTo(Object o) 
	{if(this.getSide()>((Square)o).getSide()) 
		return 1;
	else if (this.getSide()<((Square)o).getSide())
		return -1;
	else return 0;
	}

	public Object max(Object a, Object b) 
	{if(((Square)a).getSide()>=((Square)b).getSide()) 
		return a;
	else return b;
	}
}
