abstract class Base
{
	int x;
	int y;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	abstract void display();
}

class MyRegister
{
	void Register(Base b)
	{
		b.display();
	}
}


class Child extends Base
{
	void get(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("display");
	}
	public static void main(String[] args)
	{
		Child c1=new Child();
		MyRegister m1=new MyRegister();
		m1.Register(c1);
	}
}

