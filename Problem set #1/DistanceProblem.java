import java.util.Scanner;

class DistanceProblem
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		
		System.out.println("Type in your 'x' coordinate for your first point");
		System.out.println("And now your 'y' coordinate for your frist point");
		int exCoordOne = in.nextInt();
		int whyCoordOne = in.nextInt();
		
		System.out.println("Type in your 'x' coordinate for your second point");
		System.out.println("And now your 'y' coordinate for your second point");
		int exCoordTwo = in.nextInt();
		int whyCoordTwo = in.nextInt();
		
		double pointX = Math.pow((exCoordTwo - exCoordOne), 2);
		double pointY = Math.pow((whyCoordTwo - whyCoordOne), 2);
		double bothPoints = pointX + pointY;
		
		double finalDistance = Math.sqrt(bothPoints);
		
		System.out.println("Your Distance is " + finalDistance);
	}
}
		
		
		

