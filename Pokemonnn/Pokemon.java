class Pokemon
{
	//properties
	private String name;
	private int index;
	private String primaryType;
	private String secondaryType;
	private int hp;
	private int maxHp;
	private int att;
	private int def;
	private int spAtt;
	private int spDef;
	private int speed;
	private boolean fainted;
	
	public Pokemon()
	{
		name = "NO NAME";
		primaryType = "NORMAL";
	}
		
	public Pokemon(String name, int index, String primaryType, String secondaryType, int hp, int att, int def, int spAtt, int spDef, int speed)
	{
		this.name = name;
		this.index = index;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
		this.hp = hp;
		this.maxHp = hp;
		this.att = att;
		this.def = def;
		this.spAtt = spAtt;
		this.spDef = spDef;
		this.speed = speed;
		this.fainted = false;
	}
	
	//*****************get methods***********************
	public String getName()
	{
		return this.name;
	}
	public int getAtt()
	{
		return this.att;
	}
	public int getDef()
	{
		return this.def;
	}
	public int getHp()
	{
		return this.hp;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	
	public boolean isFainted()
	{
		if (this.hp <= 0)
			return true;
		else
			return false;
	}
	
	
		
	
	
	
		
	@Override
	public String toString()
	{
		String temp = "";
		temp += name + "\t" + "[" + primaryType + "][" + secondaryType + "]\n";
		temp += "------------------------------------------------\n";
		temp += "Index: " + index + "\n";
		temp += "HP: " + hp + "\n";
		temp += "Attack: " + att + "\n";
		temp += "Defense: " + def + "\n";
		temp += "Special Attack: " + spAtt + "\n";
		temp += "Special Defense: " + spDef + "\n";
		temp += "Speed: " + speed + "\n";
		
		return temp;
	}
}
	
		
