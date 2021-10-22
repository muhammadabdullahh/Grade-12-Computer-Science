import java.util.Scanner;

class OneToOneThousand
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number between 1-1000: ");
		double num1 = in.nextInt();
		double added = num1 + 1;
		double divided = num1 / 2;
		double finalNum = added * divided;
		System.out.println("Your sum is " + finalNum);
	}
}
		
		
		
