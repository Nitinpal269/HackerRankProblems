class Program8
{
public static void main(String[] args)
{
for(int i=1; i<=5; i++)
{
	int temp=1;
for(int j=1; j<=7; j++)
{
if(j>=5-i&&j<=3+i)
{System.out.print(temp);
	if(j<4)
temp++;
else
	temp--;
}
else
System.out.print(" ");
}
System.out.println();
}
}
}