class Program14
{
	public static void main(String[] args)
	{
		int temp;
		for(int i=1; i<=7; i++)
		{
			 temp=7;
			temp=temp-i;
		
			for(int j=1; j<=7; j++)
				if(j<=8-i)
				{
					System.out.print(temp);
					temp--;
				}
		
				else
					System.out.print(" ");
		
		System.out.println();
		}
	}
}

		