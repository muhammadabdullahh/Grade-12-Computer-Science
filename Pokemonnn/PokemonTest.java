class PokemonTest
{
	public static void main(String[] args)
	{
		int attackingPokemon = 0;
		int defendingPokemon = 0;
		Pokemon pk1 = new Pokemon("Avalugg", 1, "Ice", "Null", 95, 117, 184, 44, 46, 28);
		Pokemon pk2 = new Pokemon("Beldum", 2, "Steal", "Psychic", 40, 55, 80, 35, 60, 30);
		
		System.out.println(pk1);
		System.out.println(pk2);
		
		while(pk1.isFainted() == false && pk2.isFainted() == false)
		{
			attackingPokemon = speedCheck(pk1, pk2);
			
			if(attackingPokemon == pk1)
				defendingPokemon = pk2;
			else if (attackingPokemon == pk2)
				defendingPokemon = pk1;
			
			attack(attackingPokemon, defendingPokemon);
			
			if(defendingPokemon.isFainted() == false)
			{
				
			}
		}
	}
	
	public static void attack(Pokemon attackingPokemon, Pokemon defendingPokemon)
	{
		int modifier = 15;
		int randVal = (int) (Math.random() * 11 + 10);
		int damage = ((int)attackingPokemon.getAtt() / (double)defendingPokemon.getDef());
		System.out.println(attackingPokemon.getName() + "attacks for " + damage + " damage");
		defendingPokemon.setHp(defendingPokemon.getHp - damage);
		
	}
	public static Pokemon speedCheck(Pokemon pk1, Pokemon pk2)
	{
		int p1Score = (int) (Math.random() * pk1.getSpeed());
		int p2score = (int) (Math.random() * pk2.getSpeed());
		
		if(p1Score > p2Score)
			return p1;
		else if(p1Score <= p2Score)
			return p2;
	}
			
}
