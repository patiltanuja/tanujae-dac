class Pr7
{
	public static void main(String args[])
      { int i,j,row=9;
	for(i=row;i>=1;i--)
	{
	for(j=1;j<=row-i;j++)
	  {
	  System.out.print(" ");	
	  }
		for(j=1;j<=i;j++)
		{
		System.out.print(i+" ");	
		}
	 System.out.println();       	
	}
      }
}