import java.util.Scanner;
public class Exercise9_3 
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.print("Enter a password: ");
	String code=input.nextLine();
	if(CheckPassword(code)) 
		System.out.println("Valid Password");
	else
		System.out.println("Invalid Password");
	}

	static boolean CheckPassword(String code)
	{if(code.length()<8) return false;
	else
		{int count=0;
		for(int i=0;i<code.length();i++)
			if(Character.isDigit(code.charAt(i)))
				count++;
		if(count<2) return false;
			else
			{boolean check=true;
			for(int i=0;i<code.length();i++)
				{check=Character.isLetterOrDigit(code.charAt(i));
				if(!check) break;
				}
			return check;
			}
		}
	}
	
	
	
}
