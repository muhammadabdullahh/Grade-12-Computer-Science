import java.util.Scanner;

class Methods
{
	public static void main(String[] args)
	{
		sayAddress();
		System.out.println(trueOrFalse());
		printBlanks(0);
		System.out.println(areaOfCircle(4.5));
		reverse("hi mr jockie");
		System.out.println(betweenOneAndSix());
		System.out.println(numSum(2));
		System.out.println(numSum(4, 6));
		
	}
	
	//All other methods	
	public static void sayAddress()
	{
		System.out.println("This is the Adress");
		System.out.println("2354 Shlong Dr.");
		System.out.println("Pickering, Ontario");
		System.out.println("L8G5HT");
	}
	public static boolean trueOrFalse()
	{
		int rand = (int) Math.random() * 2 + 1;
		if (rand == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void printBlanks(int spaces)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type in the amount of spaces");
		int numSpaces = in.nextInt();
		System.out.println("Start");
		for(int i = 0; i < numSpaces; i++)
		{
			System.out.println(" ");
		}
		System.out.println("End");
		
	}
	public static double areaOfCircle(double radius)
	{
		double area = Math.PI * (Math.pow(radius,2));
		return area;
	}
	public static void reverse(String word)
	{
		for(int i = word.length() - 1; i >= 0; i--)
		{
			System.out.print(word.charAt(i));
		}
		System.out.println();
	}
	public static int betweenOneAndSix()
	{
		int rand = (int) (Math.random() * 6 + 1);
		return rand;
	}
	public static int numSum(int numEntered)
	{
		System.out.println("The sum of " + numEntered + " is:");
		int counter = 0;
		for (int i = 0; i < numEntered; i++)
		{
			counter = counter + ((int) (Math.random() * 6 + 1));
		}
		return counter;
	}
	public static int numSum(int numRolls, int numSides)
	{
		int counter = 0;
		for (int i = 0; i < numRolls; i++)
		{
			counter = counter + ((int) (Math.random() * numSides + 1));
		}
		return counter;
	}
}
	

		
		
