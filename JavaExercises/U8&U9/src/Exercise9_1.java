import java.util.Scanner;


public class Exercise9_1 
{	public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	System.out.println("Enter your SSN in the format of DDD-DD-DDDD");
	System.out.print("Enter it here: ");//����SSN
	String number=input.nextLine();      //��ȡһ�е�����
	boolean check=CheckSSN(number);      //���÷���
	if(check) System.out.println("Valid SSN");  //���SSN�Ƿ���Ч
	else System.out.println("Invalid SSN");}
	
//���SSN�ķ���������һ���߼�ֵ
	static boolean CheckSSN(String number)
	{boolean check=true;
	if(number.length()!=11) check=false;//��鳤��
	if(check==false) return check;
	else
		{for(int i=0;i<3;i++)      //���ǰ��λ�Ƿ�������
			check=Character.isDigit(number.charAt(i));
        if(check==false) return check;
		check=('-'==number.charAt(3)&&'-'==number.charAt(6));
       //����4��7λ�ǲ���-
        if(check==false) return check;     
		for(int i=4;i<6;i++)//����5��6λ�Ƿ�Ϊ����
			check=Character.isDigit(number.charAt(i));
        if(check==false) return check;
		for(int i=7;i<11;i++)//��8��9��10��11λ�Ƿ�Ϊ����
			check=Character.isDigit(number.charAt(i));
		return check;
		}
	}
}

