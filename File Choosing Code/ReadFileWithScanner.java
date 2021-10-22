import java.util.Scanner;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

class ReadFileWithScanner
{
	public static void employee1(String[] args)
	{
		try
		{
			Scanner in = new Scanner (new File("employees.txt"));
			
			while(in.hasNextLine())
			{
				line = (in.nextLine());
			}
			in.close();
		}
		catch(FileNotFoundException s)
		{
			System.out.println("ERROR: file not found");
		}
	}
	
	public static void employee2(String[] args)
	{
		try
		{
			String[] line;
			Scanner in = new Scanner(new File("employees2.txt"));
			
			while(in.hasNextLine())
			{
				line = in.nextLine().split(",");
				System.out.println(Double.parseDouble(line[2]) * Integer.parseInt(line[3]));
			}
			in.close();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("ERROR: file not found");
		}
	}
	
}
