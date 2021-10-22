class Sphere
{
	private double radius;
	
	//*******************CONTRUCTOR METHODS********************
	public Sphere()
	{
		this.radius = 1;
	}
	
	public Sphere(double radius)
	{
		if(radius > 0.0)
			this.radius = radius;
		else
			this.radius = 1;
	}
	public Sphere(Sphere other)
	{
		this.radius = other.radius;
	}
	
	//*****************ACCESSOR********************************
	public double getRadius()
	{
		return radius;
	}
	
	//*****************MUTATOR*********************************
	public void setRadius(double radius)
	{
		if(radius > 0.0)
			this.radius = radius;
	}
	
	//*****************INSTANCE********************************
	public double volume()
	{
		double volume = 0;
		volume = (4/3) * (Math.PI * (Math.pow(this.radius, 3)));
		return volume;
	}
	
	//*****************TO STRING*******************************
	@Override
	public String toString()
	{
		String temp = "";
		temp += "Radius: " + this.radius + "\n";
		temp += "Volume: " + volume();
		return temp;
	}
}
