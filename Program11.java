class Program11
{
	public static void main(String[] args)
	{
		for(int i=1; i<=7; i++)
		{
			int k=1;
			if(i<=4)
				k++;
			else
				k--;
			for(int j=1; j<=4; j++)
				if(j<=k)
					System.out.print("*");
				else
					System.out.print(" ");
		
		System.out.println();
		}
	}
}

		