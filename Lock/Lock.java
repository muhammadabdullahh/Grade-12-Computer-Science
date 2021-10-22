class Lock
{
	private int key;
	private int failedAttempts;
	private boolean open;
	
	public Lock(int key)
	{
		this.key = key;
		this.open = true;
		this.failedAttempts = 0;
	}
	
	public void close()
	{
		open = false;
	}
	
	public boolean isOpen()
	{
		return open;
	}
	
	public void open(int key)
	{
		if(this.key == key)
		{
			open = true;
			failedAttempts = 0;
		}
		else
		{
			failedAttempts++;
			if(failedAttempts >= 3)
			{
				System.out.println();
				System.out.println("STOP");
				System.out.println("WARNING: Self destruct in 3 seconds");
			}
		}
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(this == other)
			return true;
		
		if(! (other instanceof Lock))
			return false;
			
		Lock c = (Lock)other;
		
		if(c.key == this.key)
			return true;
		
		return false;		
	}
}
	
	
