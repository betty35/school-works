import java.util.*;
public class Exercise9_35 
{
	static int[] findGenome(String string,int start)
	{int[] giveback=new int[2];
	giveback[0]=-1;giveback[1]=-1;
	int i=string.indexOf("ATG",start);
	if(i==-1)
		return giveback;
	else
		{giveback[0]=i+3;
		for(int j=i+3;j<string.length()-3;j+=3)
		{String tri=string.substring(j, j+3);
			if(tri.equals("TAG")||tri.equals("TAA")||tri.equals("TGA")) 
			{giveback[1]=j-1;break;}
		}
		return giveback;
		}
	}
	
	
	public static void main(String[] args)
	{
	System.out.print("Enter a genome string please: ");
	Scanner input=new Scanner(System.in);
	String genome=input.nextLine();
	int[] store=findGenome(genome,0);
	
	if(store[0]<0)
		{System.out.println("no gene is found");System.exit(0);}
	
	for(int i=0;i<genome.length()-9;i++)
		{store=findGenome(genome,i);
			if(store[0]<0) break;
			else if(store[1]<0) {i+=2;continue;}
			else 
			{System.out.println(genome.substring(store[0],store[1]));
			i=store[1];
			}
		}
		
	}

}
