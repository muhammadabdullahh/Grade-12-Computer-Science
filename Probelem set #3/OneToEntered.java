import java.util.Scanner;

class OneToEntered
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 1-100: ");
		int num1 = in.nextInt();
		
		for( int i = 1; i <= num1; i++) 
		{ 
			System.out.println(i); 
		}	
	}
}
