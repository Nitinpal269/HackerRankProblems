class Program15
{
	public static void main(String[] args)
	{
		int k,x;
		for(int i=1; i<=7; i++)
		{
			 k=1;
			 x=1;
			 if(i<=4)
				 k++;
			 else
				 k--;
		
			for(int j=1; j<=5; j++)
				if(j>=6-k)
				{
					System.out.print(x);
					x++;
				}
				else
					System.out.print(" ");
		
		System.out.println();
		}
	}
}

		