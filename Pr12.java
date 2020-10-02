class Pr12
{
	public static void main(String args[])
      { int i,j,row=6;
	for(i=row;i>0;i--)
	{
	for(j=1;j<=row-i;j++)
	  {
	  System.out.print(" ");	
	  }
		for(j=1;j<=i;j++)
		{
		System.out.print(" *");	
		}
	 System.out.println();       	
	}
      }
}