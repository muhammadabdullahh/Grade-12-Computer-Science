class Cylinder 
{
	private double radius;
	private double height;
	
	public Cylinder()
	{
		this.radius = 1.0;
		this.height = 1.0;
	}
	
	public Cylinder(double radius, double height)
	{
		if(radius > 0 && height > 0)
		{
			this.radius = radius;
			this.height = height;
		}
		else
		{
			this.radius = 1.0;
			this.height = 1.0;
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setRadius(double radius)
	{
		if(radius > 0.0)
			this.radius = radius;
	}
	
	public void setHeight(double height)
	{
		if(radius > 0.0)
			this.height = height;
	}
	
	public String toString()
	{
		return "CYLINDER: Height - " + height + " Radius - " + radius;
	}
}
	
