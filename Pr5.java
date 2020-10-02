import java.util.Scanner;
class Pr5
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter row");
	int row=sc.nextInt();
	int space=row;
	for(int i=1;i<=row;i++)
	{int c=1;
	for(int j=1;j<=space;j++)
	{	
	 System.out.print(" ");
        }
	space--;
	for(int k=1;k<=i;k++)
	{
	 System.out.print(c);
	c++;
	}
	c=c-2;
	for(int l=2;l<=i;l++)
	{
	 System.out.print(c);
	c--;
	}
	c=1;
	 System.out.println();
}
}
}
	
