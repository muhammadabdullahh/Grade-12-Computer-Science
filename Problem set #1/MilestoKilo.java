
import java.util.Scanner;

class MilestoKilo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi, i will be converting your miles into kilometers");
		System.out.println("Please type in your number");
		
		double miles = in.nextDouble();
		
		System.out.println("This is " + miles * 1.609344 + " Kilometres");
		
	}
}
