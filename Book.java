import java.io.*;
class Demo
{
	int div()throws ArithmeticException, IOException
	{
		int x=System.in.read();
		int y=System.in.read();
		return x/y;
	}
}

class Book
{
	public static void main(String[] args)throws ArithmeticException, IOException
	{
		Demo d=new Demo();
		int z=d.div();
		System.out.println(z);
	}
}


