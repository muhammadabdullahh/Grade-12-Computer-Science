class PokemonFileDex
{
	String name;
	int index;
	String primaryType;
	String secondaryType;
	int hp;
	int att;
	int def;
	int spAtt;
	int spDef;
	int speed;
	
	public PokemonFileDex(String name, int index, String primaryType, String secondaryType, int hp, int att, int def, int spAtt, int spDef, int speed)
	{
		this.name = name;
		this.index = index;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.spAtt = spAtt;
		this.spDef = spDef;
		this.speed = speed;
	}
	@Override
	public String toString()
	{
		return name + "," + index + "," + primaryType + "," + secondaryType + "," + hp + "," + att + "," + def + "," + spAtt + "," + spDef + "," + speed + "\n";
	}
}
