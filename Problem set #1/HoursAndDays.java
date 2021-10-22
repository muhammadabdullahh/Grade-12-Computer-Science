
import java.util.Scanner;

class HoursAndDays
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in the amount of hours that you would like to convert");
		
		int hours1 = in.nextInt();
		
		int days =(hours1 / 24);
		
		int hours2 =(hours1 - (days * 24));
		
		System.out.println("That would be " + days + " days and " + hours2 + " hours");
	}
}
	
