import java.util.Scanner;

class LockerCombination
{
	public static void main(String[] args)
	{
		System.out.println("Hi, please type in your full name");
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		
		int rand1 = (int)(Math.random() * 100);
		int rand2 = (int)(Math.random() * 100);
		int rand3 = (int)(Math.random() * 100);
		
		System.out.println("Hello " + name + " your combination is");
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		
		System.out.println("Dont forget it!!");
	}
}
		
