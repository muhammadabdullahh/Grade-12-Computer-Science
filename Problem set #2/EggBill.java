import java.util.Scanner;

class EggBill
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type in the number of eggs your are buying: ");
		int eggs = in.nextInt();
		
		int dozenCalc = (eggs / 12);
		int eggsLeft = (eggs % 12);
		
		//Over 11
		if (11 <= dozenCalc)
		{
			double dozenPrice = (dozenCalc * 0.35);
			double leftOverPrice = ((0.35 / 12) * eggsLeft);
			double totalPrice = (dozenPrice + leftOverPrice);
			System.out.println("Yout total bill is: $" + totalPrice);
		}
		
		//6-10 dozen
		else if (6 <= dozenCalc)
		{
			double dozenPrice = (dozenCalc * 0.40);
			double leftOverPrice = ((0.40 / 12) * eggsLeft);
			double totalPrice = (dozenPrice + leftOverPrice);
			System.out.println("Yout total bill is: $" + totalPrice);
		}
		
		//4-5
		else if (4 <= dozenCalc)
		{
			double dozenPrice = (dozenCalc * 0.45);
			double leftOverPrice = ((0.45 / 12) * eggsLeft);
			double totalPrice = (dozenPrice + leftOverPrice);
			System.out.println("Yout total bill is: $" + totalPrice);
		}
		//0-3 dozen
		else if (3 >= dozenCalc)
		{
			double dozenPrice = (dozenCalc * 0.50);
			double leftOverPrice = ((0.50 / 12) * eggsLeft);
			double totalPrice = (dozenPrice + leftOverPrice);
			System.out.println("Yout total bill is: $" + totalPrice);
		}
		
		
		
	}
}


	

