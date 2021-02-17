import java.util.Scanner;
class AgeCheck extends RuntimeException
{
	AgeCheck()
	{
		super("your age is under");
	}
	AgeCheck(String msg)
	{
		super(msg);
	}
}

class Temp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<=18)
		{
			throw new AgeCheck("you are not fine");
		}
		else
		System.out.println("your can vote...");
		
		
		
	}
}

