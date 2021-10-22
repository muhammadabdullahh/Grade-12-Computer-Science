import java.util.Scanner;

class LitreQuestion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type in the amount litres of gas");
		double litres = in.nextDouble();
		System.out.println("What is the price per litre");
		double gasPrice = in.nextDouble();
		
		if (litres >= 70)
		{
			double priceOff = (litres * 0.08);
			double totalPrice = (litres * gasPrice) - priceOff;
			System.out.println("Your total gas price will be: " + totalPrice);
		}
		
		else if (litres >= 40)
		{
			double priceOffTwo = (litres * 0.05);
			double totalPriceTwo = (litres * gasPrice) - priceOffTwo;
			System.out.println("Your total gas price will be: " + totalPriceTwo);
		}
		else
		{
			double totalPriceTwo = (litres * gasPrice);
			System.out.println("Your total gas price will be: " + totalPriceTwo);
		}
	}
}
