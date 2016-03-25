import java.util.GregorianCalendar;
public class Exercise8_5 
{	public static void main(String[] args)
	{GregorianCalendar now = new GregorianCalendar();
	int year = now.get(GregorianCalendar.YEAR);
	int month = now.get(GregorianCalendar.MONTH);
	int day = now.get(GregorianCalendar.DAY_OF_MONTH);
	System.out.println("It's "+month+" "+day+", "+year);
	now.setTimeInMillis(1234567898765L);
	year = now.get(GregorianCalendar.YEAR);
	month = now.get(GregorianCalendar.MONTH);
	day = now.get(GregorianCalendar.DAY_OF_MONTH);
	System.out.println("It's "+month+" "+day+", "+year);
	}
}
