import java.util.Scanner;

class HourlyPaid
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many hours did you work thus week?");
		int hours = in.nextInt();
		System.out.println("What is your hourly pay rate?");
		double rate = in.nextDouble();
		
		if (hours > 40)
		{
			int extraHours = (hours - 40);
			int beforeExtra = (hours - extraHours);
			double totalPay = ((beforeExtra * rate) + extraHours * (rate * 1.5));
			System.out.println("Your total pa for this week is: " + totalPay);  
		}
		else 
		{
			double totalPayTwo = (hours * rate);
			System.out.println("Your total pay is: " + totalPayTwo);
		}
	}
}
			
			
		
