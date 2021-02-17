class A
{
	A()
	{
		super();
		System.out.println("A");
	}
}

class B extends A
{
	B(int x)
	{
		super();
		System.out.println("B");
	}
	B()
	{
		super();
		System.out.println("default");
	}
}

class C extends B
{
	C()
	{
		super(10);
		System.out.println("c");
	}
	C(int x)
	{
		super();
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		new C();
		new C(10);
	}
}

