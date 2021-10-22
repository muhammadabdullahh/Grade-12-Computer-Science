import java.util.Scanner;

class CookieProblem
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount of cookies");
		
		int cookies = in.nextInt();
		
		int boxes = cookies / 12;
		double leftOverCookies = cookies % 12;
		
		int cartons = boxes / 24;
		int leftOverBoxes = boxes % 24;
		
		double cartonsProfit = cartons * 24 * 1.14;
		
		double leftOverBoxesProfit = leftOverBoxes * 0.57;
		
		double totalProfit = cartonsProfit + leftOverBoxesProfit;
		
		System.out.println("Cartons: " + cartons);
		System.out.println("Left Over Boxes: " + leftOverBoxes);
		System.out.println("Left Over Cookies: " + leftOverCookies);
		System.out.println("Your total profit is $" + totalProfit);
		
	}
}
		
		
		
		
		
