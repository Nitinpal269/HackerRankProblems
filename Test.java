class Test
{
	int add(int x, int y)
	{
		int z=x+y;
		return z;
	}
	int subtract(int z, int j)
	{
		int f=z-j;
		return f;
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(t.add(5,6));
		System.out.println(t.subtract(10,6));
		
	}
}

	
	
