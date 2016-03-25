
public class Exercise11_2 
{

}


class Person
{protected String name,address,email,phone_number;

	public Person() {}
	
	public Person(String name,String address,String email,String number)
	{this.name=name;
	this.address=address;
	this.email=email;
	phone_number=number;
	}
	
	public String ToString()
	{return name+" is a Person";
	}
}

class Student extends Person
{protected String st;
protected int status;
	
	public Student(String name,String address,String email,String number,int status)
	{super(name,address,email,number);
	this.status=status;
	}
	
	public Student(){}

	  public String toString()
	  {switch(status)
		  {case 1:st="freshman";break;
		   case 2:st="sophomore";break;
		   case 3:st="junior";break;
		   case 4:st="senior";break;
		   default:st="";break;
		  }
		  
		  return name+" is a "+st+"Student";
	  }
	
}

class Employee extends Person
{protected String office;
protected int salary;
protected MyDate date_hired;

	public Employee(){}

	public Employee(String name,String address,String email,
		String number,String office,int salary,MyDate date_hired)
	{super(name,address,email,number);
	this.office=office;
	this.salary=salary;
	this.date_hired=date_hired;
	}
	
	
	public String toString() 
	{return name+" is a "+"Employee";
	}
	

}

class MyDate
{ int year,month,day;
	public MyDate(int year,int month,int day)
	{this.year=year;
    this.month=month;
    this.day=day;
    }
}


class Faculty extends Employee
{protected String office_hours;
protected int rank;
protected String rk;

	public Faculty(){}
	
	public Faculty(String name,String address,String email,
			String number,String office,int salary,MyDate date_hired,String office_hours,int rank)
	{super(name,address,email,number,office,salary,date_hired);
	this.rank=rank;
	this.office_hours=office_hours;	
	}
	
	public String toString() 
	{switch(rank)
		{case 1: rk="lecturer";break;
		 case 2: rk="assistant-professor";break;
		 case 3: rk="associate-professor";break;
		 case 4: rk="professor";break;
		 default: rk="";break;
		}
		return "Faculty "+ name+" is a "+ rk;
	}

}


class Staff extends Employee
{protected String title;

	public Staff()
	{}

	public Staff(String name,String address,String email,
	String number,String office,int salary,MyDate date_hired,String title)
	{super(name,address,email,number,office,salary,date_hired);
	this.title=title;
	}

	public String toString() 
	{return name+" is a "+"Staff";}
	
}


