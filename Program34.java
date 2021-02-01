class Program34
{
	public static void main(String[] args)
	{
		int row=5,p,k=1;
		for(int i=1; i<=5; i++)
		{
			p=k;
			for(int j=1; j<=5; j++)
			{
				System.out.print(p);
				p=p-(row-i+j);
			}
			System.out.println();
			k=k+1+row-i;
		}
	}
}

