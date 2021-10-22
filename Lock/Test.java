class Test
{
	public static void main(String[]args)
	{
		Lock lock1 = new Lock(111);
		Lock lock2 = new Lock(222);

		lock1.close();
		lock2.close();

		System.out.println("is Lock 1 Open?: " + lock1.isOpen());
		System.out.println("is Lock 2 Open?: " + lock2.isOpen());
		System.out.println();
		
		System.out.println("Attemped to open lock");
		lock1.open(123);
		lock1.open(456);
		lock2.open(222);
		lock1.open(789);
		lock1.open(111);
		
		System.out.println();
		System.out.println("is Lock 1 Open?: " + lock1.isOpen());
		System.out.println("is Lock 2 Open?: " + lock2.isOpen());
		System.out.println();
		
		System.out.println("Are locks the same? " + lock1.equals(lock2));
	}	
}
