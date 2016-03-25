public class Exercise6_27 
{	public static boolean equal(int[] list1,int[] list2)
	{int i=list1.length;
	int j=list2.length;
	if(list1!=list2) return false;
	else 
		{for(i=0;i<j;i++)
			if(list1[i]!=list2[i]) return false;
		return true;
		}
	}

	public static void main(String[] args)
	{
		
	}
}
