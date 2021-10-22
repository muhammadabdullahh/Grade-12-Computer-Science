import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

class PokemonCreator
{
	
	public static void main(String[] args)
	{
		//String name, int index, String primaryType, String secondaryType, int hp, int att, int def, int spAtt, int spDef, int speed
		PokemonFileDex PK1 = new PokemonFileDex("juju", 1234, "Hot", "Water", 100, 100, 100, 100, 100, 100);
		
		System.out.println(PK1);
	}
}
					
					
