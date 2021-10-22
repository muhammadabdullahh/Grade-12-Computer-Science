class Dice
{

	public static int roll()
	{
		int rand = (int) (Math.random() * 6 + 1);
		return rand;
	}
	public static int roll(int numEntered)
	{
		int counter = 0;
		for (int i = 0; i < numEntered; i++)
		{
			counter = counter + ((int) (Math.random() * 6 + 1));
		}
		return counter;
	}
		public static int roll(int numRolls, int numSides)
	{
		int counter = 0;
		for (int i = 0; i < numRolls; i++)
		{
				counter = counter + ((int) (Math.random() * numSides + 1));
		}
		return counter;
	}
}
