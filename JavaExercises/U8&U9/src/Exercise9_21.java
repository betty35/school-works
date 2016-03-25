import java.io.*;
import java.util.*;
public class Exercise9_21 
{	public static boolean fileExist(String pathname) throws FileNotFoundException
	{File open=new File(pathname);
	if(!open.exists())
		{System.out.println("Invalid pathname!");
		return false;
		}
	else if(!open.canRead()||!open.canWrite())
		{System.out.println("Can't read or write!");
		return false;
		}
	else
		return true;
	}


	public static int removeString(String pathname,String string) throws Exception
	{File file=new File(pathname);
		if(!fileExist(pathname)) return 0;
	else 
		{int count=0;
		Scanner source=new Scanner(file);
		String temp="";
		while(source.hasNext())
			{String s=source.next();
			if(s==string) {temp=temp+" "; count++;}
			else temp=temp+" "+s;
			}
		source.close();
		PrintWriter output=new PrintWriter(file);
		output.print(temp);
		if(count==0) System.out.println("No keyword matches");
		else System.out.println("Successfully Removed");
		return 1;
		}
		
	}

	
	//第一个参数是文件目录，第二个是要替换的字符
	public static void main(String[] args)throws Exception
	{if(args.length!=2) 
		{System.out.println("2 args needed. Check and retry please,");
		System.exit(0);
		}
	else 	
		removeString(args[0],args[1]);
	}
}
