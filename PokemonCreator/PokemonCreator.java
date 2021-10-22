import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

class PokemonCreator
{
	static String name;
	static int index;
	static String primaryType;
	static String secondaryType;
	static int hp;
	static int att;
	static int def;
	static int spAtt;
	static int spDef;
	static int speed;
	static int total;
	static int answer;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		do
		{
			if(displayExit())
			{
				try
				{
					//get all info
					getPokeInfo();
					
					//create pokedex fole
					FileWriter out = new FileWriter(new File("newPokedex.csv"),true);
						
					//write the info collected
					out.append(name + "," + index + "," + primaryType + "," + secondaryType + "," + hp + "," + att + "," + def + "," + spAtt + "," + spDef + "," + speed + "," + total + "\n");
						
					//close file
					out.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		while(answer == 1);
		
	}
	
	public static void getPokeInfo()
	{
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("What is the Name: ");
			name = in.next();
		}
		while(isNameTaken(name));
		
		System.out.print("What is their Index number: ");
		index = in.nextInt();
		System.out.print("What is the Primary Type: ");
		primaryType = in.next();
		System.out.print("What is the Secondary Type: ");
		secondaryType = in.next();
		System.out.print("What is the HP: ");
		hp = in.nextInt();
		System.out.print("What is the Attack: ");
		att = in.nextInt();
		System.out.print("What is the Defence: ");
		def = in.nextInt();
		System.out.print("What is the Special Attack: ");
		spAtt = in.nextInt();
		System.out.print("What is the Special Defence: ");
		spDef = in.nextInt();
		System.out.print("What is the speed: ");
		speed = in.nextInt();
		total = hp + att + def + spAtt + spDef + speed;
	}
	public static boolean displayExit()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to PokeCreator");
		System.out.println();
		System.out.println();
		System.out.println("\t 1: Create a Pokemon");
		System.out.println("\t 2: Exit");
		System.out.println();
		do
		{
			System.out.print("Enter your choice: ");
			answer = in.nextInt();
		}
		while(answer != 1 && answer != 2);
		if(answer == 1)
		return true;
		else 
		return false;
		
	}
	public static boolean isNameTaken(String name)
	{
		try
		{
			String[] line;
			Scanner in = new Scanner (new File("newPokedex.csv"));
			
			while(in.hasNextLine())
			{
				line = in.nextLine().split(",");
				if(line[0].equalsIgnoreCase(name))
				{
					System.out.println("Name taken");
					return true;
				}
			}
			in.close();
		}
		catch(FileNotFoundException s)
		{
			System.out.println("ERROR: file not found");
		}
		return false;
	}
		
	
}
