
import java.util.Scanner;

class AverageNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi i will caculate your average");
		
		System.out.println("Begin with your first number");
		double num1 = in.nextDouble();
		
		System.out.println("And now your second");
		double num2 = in.nextDouble();
		
		System.out.println("And now your third");
		double num3 = in.nextDouble();
		
		double average = (num1 + num2 + num3)/3.0;
		
		System.out.println(average);
	}
}
		
		
		
