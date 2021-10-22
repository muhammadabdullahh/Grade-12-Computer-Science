import java.util.Scanner;

class TortoiseQuestion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 System.out.println("How long do you want the race to be");
		 int raceLength = in.nextInt();
		 
		 int tortaise = 0;
		 int hare = 0;
		 int counter = 0;
		 
		 // inside the loop
		   while(counter <= raceLength)
		{ 
				try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("delay failed");
			}
				 int randT = (int) (Math.random() * 10 + 1);
			 int randH = (int) (Math.random() * 10 + 1);
			 counter ++;
			 
			 //TORTAISE
			 // Tortaise 50%
			 if (randT == 5 || randT == 4 || randT == 3 || randT == 2 || randT == 1)
			 {
				 tortaise = tortaise + 3;
				 System.out.println("Tortaise hoped 3 squares ahead");
				 System.out.println("Tortaise Position:" + tortaise);
			 }
			 //Tortaise 30%
			 else if (randT == 8 || randT == 9 || randT == 10)
			 {
				 tortaise = tortaise + 1;
				 System.out.println("Tortaise jumped 1 square ahead");
				 System.out.println("Tortaise Position:" + tortaise);
			 }
			 //Tortaise 20%
			 else if (randT == 6 || randT == 7)
			 {
				 tortaise = tortaise - 6;
				 System.out.println("Tortaise fell 6 squares back");
				 System.out.println("Tortaise Position:" + tortaise);
			 }
			 
			 //HARE
			 //Hare 30% 6,7,8
			 if (randH == 6 || randH == 7 || randH == 8)
			 {
				 hare = hare + 1;
				 System.out.println("Hare moved 1 square ahead");
				 System.out.println("Hare Position:" + tortaise);
			 }
			 //Hare 20% 9,10
			  else if (randH == 9 || randH == 10)
			 {
				 hare = hare - 2;
				 System.out.println("Hare moved 2 squares back");
				 System.out.println("Hare Position:" + tortaise);
			 }
			 // Hare 20% 1,2
			 else if (randH == 1 || randH == 2)
			 {
				 hare = hare + 0;
				 System.out.println("Hare moved 0 squares");
				 System.out.println("Hare Position:" + hare);
			 }
			 //Hare 20% 3,4
			 else if (randH == 3 || randH == 4)
			 {
				 hare = hare + 9;
				 System.out.println("Hare moved 9 squares ahead!");
				 System.out.println("Hare Position:" + hare);
			 }
			 //Hare 10% 5
			 else if (randH == 5)
			 {
				 hare = hare - 9;
				 System.out.println("Hare moved 9 squares back!");
				 System.out.println("Hare Position:" + hare);
			 }
			 
		 }
		 if (tortaise > hare)
		 {
			 System.out.println("The big guy Totaise has destroyed the hare");
			 System.out.println("Final Score: " + " Tortaise " + tortaise + " - " + " hare " + hare);
		 }
		 if (tortaise < hare)
		 {
			 System.out.println("The big guy Hare has destroyed the Tortaise");
			 System.out.println("Final Score: " + " Hare " + hare + " - " + " Tortaise " + tortaise);
		 }
	 }
 }
		

	
	
	

		 
			 
		 
	
		 
			 
			 
		
		
		
		
