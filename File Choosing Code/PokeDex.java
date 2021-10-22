import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

class PokeDex
{
	public static void main(String[] args)
	{
		
		try
		{
			String[] line;
			Scanner in = new Scanner(new File("PokeDex.txt"));
			Scanner inName = new Scanner(System.in);
			
			System.out.println("Type in the pokemon");
			String name = inName.next();
			
			System.out.println();
			
			while(in.hasNextLine())
			{
				line = in.nextLine().split(",");
				if(name.equalsIgnoreCase(line[0]))
				{
					System.out.println("Name - " + line[0]);
					System.out.println("Index - " + line[1]);
					System.out.println("Primary Type - " + line[2]);
					System.out.println("Secondary Type - " + line[3]);
					System.out.println("HitPoints - " + line[4]);
					System.out.println("Attack - " + line[5]);
					System.out.println("Defense - " + line[6]);
					System.out.println("Special Attack - " + line[7]);
					System.out.println("Special Defense - " + line[8]);
					System.out.println("Speed - " + line[9]);
					System.out.println("Total - " + line[10]);
		
				}
			
			}
			in.close();
		}
		catch(FileNotFoundException e)	
		{
			System.out.println("ERROR: File not found!");
		}
	}
}
			
		
