import java.util.Scanner;

class AddEachDigit
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter and number of your choice: ");
		int numEntered = in.nextInt();
		int sum = 0;
		
		while (numEntered > 0)
		{
			sum = (numEntered % 10 + sum);
			numEntered = (numEntered / 10);
		}
		System.out.println("Total: " + sum);
	}
}

		
	
