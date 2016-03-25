import java.util.Scanner;


public class Exercise9_1 
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.println("Enter your SSN in the format of DDD-DD-DDDD");
	System.out.print("Enter it here: ");//输入SSN
	String number=input.nextLine();      //读取一行的输入
	boolean check=CheckSSN(number);      //调用方法
	if(check) System.out.println("Valid SSN");  //输出SSN是否有效
	else System.out.println("Invalid SSN");}
	
//检查SSN的方法，返回一个逻辑值
	static boolean CheckSSN(String number)
	{boolean check=true;
	if(number.length()!=11) check=false;//检查长度
	if(check==false) return check;
	else
		{for(int i=0;i<3;i++)      //检查前三位是否是数字
			check=Character.isDigit(number.charAt(i));
        if(check==false) return check;
		check=('-'==number.charAt(3)&&'-'==number.charAt(6));
       //检查地4、7位是不是-
        if(check==false) return check;     
		for(int i=4;i<6;i++)//检查第5、6位是否为数字
			check=Character.isDigit(number.charAt(i));
        if(check==false) return check;
		for(int i=7;i<11;i++)//地8、9、10、11位是否为数字
			check=Character.isDigit(number.charAt(i));
		return check;
		}
	}
}

