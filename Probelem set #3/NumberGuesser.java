import java.util.Scanner;

class NumberGuesser
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number untill you are correct");
		int guess;
		
		do 
		{
			System.out.println("Type in a gues between 0-10");
			guess = in.nextInt();
		}
		while (guess != 0);
		System.out.println("YOU ARE CORRECT HOORAYY");
	}
}
		
			
		

		
