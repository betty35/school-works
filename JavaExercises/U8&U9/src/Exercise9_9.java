import java.util.Scanner;
public class Exercise9_9 
{
	public static String binaryToHex(String binaryString)
	{String hex="";
	int decimal=binaryToDecimal(binaryString);
	while(decimal!=0)
		{int temp=decimal%16;
		decimal/=16;
		hex=toHexChar(temp)+hex;
		}
	return hex;
	}
	
	static char toHexChar(int de)
	{char t='0';
	if(de<10) {t+=de;return t;}
	else 
		{t='A'-10;
		t+=de;
		return t;
		}
	}
	
	static int binaryToDecimal(String bin)
	{int sum=0;
	for(int i=0;i<bin.length();i++)	sum=sum*2+bin.charAt(i)-'0';
	return sum;
	}
	
	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		System.out.print("Enter a binary number: ");
	String binary=input.nextLine();
	System.out.println("Change it to hex: "+ binaryToHex(binary));	
	}
}
