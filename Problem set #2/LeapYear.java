import java.util.Scanner;

class LeapYear
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your year:");
		int year = in.nextInt();
		
		if (year % 100 ==0)
		{
			System.out.println("This is not a leap year");
		}
		
		else if (year % 4 == 0 || year % 400 == 0 && year > 1582)
		{
			System.out.println( year + " is indeed a leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}
}
			
			
			
		
		
			
		
		
