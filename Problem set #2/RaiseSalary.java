import java.util.Scanner;

class RaiseSalary
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in your salary");
		double salary = in.nextDouble();
		System.out.println("Type in your rating from 1-3");
		int rating = in.nextInt();
		
		if (rating == 3)
		{
			double extraSalary = salary * 0.06;
			double totalSalary = salary + extraSalary;
			System.out.println("Your raise will be: " + extraSalary);
			System.out.println("Your total salary with your raise is: " + totalSalary);
		}
		else if (rating == 2)
		{
			double extraSalary = salary * 0.04;
			double totalSalary = salary + extraSalary;
			System.out.println("Your raise will be: " + extraSalary);
			System.out.println("Your total salary with your raise is: " + totalSalary);
		}
		else 
		{
			double extraSalary = salary * 0.015;
			double totalSalary = salary + extraSalary;
			System.out.println("Your raise will be: " + extraSalary);
			System.out.println("Your total salary with your raise is: " + totalSalary);
		}
	}
}
			


