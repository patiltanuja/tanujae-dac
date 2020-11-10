//=======================Array Assignment====================
package Assignment3;
import java.util.Scanner;
public class Que1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index value for array 1");
		int m = sc.nextInt();
		System.out.println("enter index value for array 2");
		int n = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[n];
		
		System.out.println("enter value for array 1");
		for(int i=0;i<m;i++)
		{
		a[i] = sc.nextInt();
		}
		
		System.out.println("enter value for array 2");
		for(int i=0;i<n;i++)
		{
		b[i] = sc.nextInt();
		}
		
		int n1 = m+n;
		int c[]=new int[n1];
		
		int num=0,count=0;
		while(num<n1) 
		{
			if(count<m)
			{
				c[num] = a[count];
				num++;
			}
			if(count<n)
			{
				c[num] = b[count];
				num++;
			}
			count++;
			
		}
		
		for(int i=0;i<n1;i++)
		{
		
			System.out.println(c[i]+" ");
		}
	}
}
//===============================
package Assignment3;
import java.util.Scanner;
class Que2
 {
	static void avg(int a[],int n)
	{
		int i,avg=0,sum=0;
		
		for(i=0;i<n-2;i++)
		{
			sum = (a[i]+a[i+1]+a[i+2]);
			System.out.println(sum/3+" ");
		}
	}


	public static void main(String args[])
	{
	
	
	long Avg=0;
	int a[]= {5,14,35,89,140};
	int n = a.length;
	avg(a,n);
    
	}	
}
//=========================================
package Assignment3;
import java.util.Scanner;
public class Que3 {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int i,j,square=0,cube=0;
	for(i=1;i<n;i++)
	{
		if(i%2==0)
		{
			square = i*i;
			System.out.print(square+" ");
		}
		else
		{
			cube=i*i*i;
			System.out.print(cube+" ");
		}
	}
	}
}
//=========================================
package Assignment3;

import java.util.Scanner;

public class Que4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenght");
		int l= sc.nextInt();
		int a[] = new int[l];
		int c1=0,c2=0;
		
		System.out.println("enter values for array ");
		for(int i=0;i<l;i++)
		{
		a[i] = sc.nextInt();
		}
		
		for(int i=0;i<l;i++)
		{
		  for(int j=i;j<l-1;j++)
		    {
			
				if(a[i]>=a[j])
					c2++;
				else if(a[i]<=a[j])
					c1++;
			}
		}
		
		//if(c1==1 || c2==1)
		
		//{
		 if (c1>c2)
		 {
		System.out.println("Decending");
		 }
		else if(c1<c2)
		{	System.out.println("Ascending");
		}
		else {
			System.out.println("Random");
		}
	}
}
//=================================================
import java.util.Scanner;
class Que5 { 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any floting number");
		float x =sc.nextFloat(); 
		sc.close();
        int count=0;
        do
    	{
    	    x =x*10;
    		count++ ;
    	} 
    while(x != (int)x);
	System.out.println("digit after decimal is:"+count);
	} 
}
//===========================================
import java.util.Scanner;
public class Que6 {
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number of elemnt you want to insert");
	    int temp, size;
	    int n=sc.nextInt();
	    int array[] =new int[n];
	    System.out.println("Enter the value of elemnt that you want to insert");
	    for(int i=0;i<array.length;i++) 
	    {
	      array[i]=sc.nextInt();	
	    }
         size = array.length;
      for(int i = 0; i<size; i++ )
      {
      for(int j = i+1; j<size; j++)
      {
         if(array[i]>array[j])
         {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
      }
   }
   System.out.println("Third largest number is:: "+array[size-3]);
   sc.close();
   }
}