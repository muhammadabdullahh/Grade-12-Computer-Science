import java.util.Scanner;

class HiLoQuestionModified
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Are your ready? ");
		String rspns = in.next();
		
		int rand1 = (int)(Math.random() * 10 + 1);
		
		//Number guess part
		System.out.println("Guess the number: ");
		int guess = in.nextInt();
	
		if(guess == rand1)
		{
			System.out.println("WOW, your are correct");
		}
		do
		{
			if (guess > rand1)
			{
				System.out.println("Your guess is too high");
				guess = in.nextInt();
			}
			else if (guess < rand1)
			{
				System.out.println("Your guess is too low");
				guess = in.nextInt();
			}
		}
		while (guess != rand1);
		System.out.println("WOW, your are correct");
		
	}
}
		
		
	

