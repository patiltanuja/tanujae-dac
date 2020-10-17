/*01.Write a program to print Hello World. Compile and run it using command prompt*/
/*
class Pr1
{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}
*/
//-----------------------------------------------------------------------------------------------------------------------------

/* 02.Write a program to declare a variable named rollNo of integer type. Assign it a value (let say 100)
 to it and print the following statement roll no = 100 .*/
/*
class Pr2
{ 
    public static void main(String args[])
    {
    int rollNo = 100;
    System.out.println("roll no = "+rollNo);
    }
}

*/
//------------------------------------------------------------------------------------------------------------------------------
/*
03.Find the result of following expressions. You need to determine the primitive data type of the
 variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/
/*
class Pr3
{ 
    public static void main(String args[])
    {
        
        double x=3,a=2,y,z;
       // y=Math.pow(x,a)+3*x-7;
	y=x*x+3*x-7;
        System.out.println(y);
	 y=x++ + ++x;
        System.out.println(y);
	z=x++ - --y - --x + x++;
        System.out.println(z);
       boolean d,c=true,b=true;
	d=((b && c)||!(b || c));
        System.out.println(d);
    }
}*/
//-----------------------------------------------------------------------------------------------------------------------------
/*
04.Write a program that initializes 2 byte type of variables. Add the values of these variables
 and store in a byte type of variable. [Note: primitive down casting is required in this program ] .*/
/*
class Pr4
{
public static void main(String args[])
    {
	short b=25,c=24;
	byte d=(byte)(b+c);
	System.out.println(d);
}
}*/
//---------------------------------------------------------------------------------------------------------------------------
/*05.Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.*/
/*
class Pr5
{
public static void main(String args[])
    {   
	System.out.println("Welcome"+args[0]);
     }
}
*/
//-------------------------------------------------------------------------------------------------------------------------
/*06.Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.*/
/*
import java.util.Scanner;
class Pr6
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int r=sc.nextInt();
	float area = (3.14f)*r*r;
	System.out.println("area of circle is= "+area);
	float circumference=(3.14f)*r;
	System.out.println("circumference of circle is= "+circumference);
	}
}
*/
//-------------------------------------------------------------------------------------------------------------------------
/*07. a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user 
using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
/*import java.util.Scanner;
class Pr7
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first subject marks");
	int a[]=new int[5];
	int i,sum=0,p=1;
	for(i=0;i<5;i++)
	{
	a[i] = sc.nextInt();
	sum=sum+a[i];
	p=sum/5;
	}
	System.out.println("percentage marks= "+p+"%");
	}
}*/
//---------------------------------------------------------
/*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from
 user using Scanner class*/

/*
import java.util.Scanner;
class Pr8
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter principle amount");
	int p=sc.nextInt();
	System.out.println("enter rate");
	int r=sc.nextInt();
        System.out.println("enter time");
	int n=sc.nextInt();
	float si=(p*n*r)/100f;
	System.out.println("Simple interest is= "+si);
	}
}
*/
//--------------------------------------------------------------------------------------------------------------
/*09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the
 entered days into complete years, months and days and print them
*/
/*import java.util.Scanner;
class Pr9
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number of days");
	int D=sc.nextInt();
	int year,day,m;
	year=D/365;
	D=D%365;
	System.out.println("number of year"+year);
	m=D/31;
	D=D%31;
	System.out.println("number of month"+m);
	day=D;
	System.out.println("number of days"+day);
	}
}*/
//-------------------------------------------------------------------------------------------------------------------------------------------------
/*10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using 
Scanner class. [ formula : C= 5*(f-32)/9 ]
*/
/*
import java.util.Scanner;
class Pr10
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("temperature in degree fahrenheit is");
	int f=sc.nextInt();
	float c=5*(f-32)/9f;
	System.out.println("temperature in degree celsius= "+c);
	}
}
	
*/
//-----------------------------------------------------------------------------------------------------------------------------------------------
/*11.	Write a program to swap two numbers without using third variable*/
/*
import java.util.Scanner;
class Pr11
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first number");
	int a=sc.nextInt();
	System.out.println("enter second number");
	int b=sc.nextInt();
        a=b+a;
	b=a-b;
	a=a-b;
        System.out.println("enter first number"+a);
	System.out.println("enter second number"+b);
	}
}
*/
----------------------------------------------------------------------------------------------------------------------------------------------
/*
12.	In a company an employee is paid as under: If his basic salary is 
less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic 
salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000
 and DA = 98% of basic salary. If the employee's salary is input by the 
user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/
/*
import java.util.Scanner;
class Pr12
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int basic_salary=sc.nextInt();
	if(basic_salary<10000)
	{
	float HRA=basic_salary*10/100;
	float DA=basic_salary*90/100;
	float GS=HRA+DA+basic_salary;
	System.out.println(GS);
	}
	else
	{
	float HRA=2000;
	float DA=basic_salary*98/100;
	float GS=HRA+DA+basic_salary;
	System.out.println(GS);
	}
}
*/
//------------------------------------------------------------------------------------------
/*13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using 
ternary operator ( logical operator) ]  */
/*import java.util.Scanner;
class Pr13
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	System.out.println("enter number");
	int b=sc.nextInt();
	System.out.println("enter number");
	int c=sc.nextInt();
	int d=(a>b && a>c)?a:c;
	System.out.println(d);
}
}
*/
//-------------------------------------------------------------------------------------------
/*14.	Program to check that entered year is a leap year or not.*/



/*
import java.util.Scanner;
class Pr14
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in); 
      System.out.println("enter no");
      int year =sc.nextInt();
      if(year%400==0 && year%100==0)
      {
          if(year%4==0)
          {
               System.out.println("Leap year");
          }
      }
      else
      {
          System.out.println("Not a leap year");
      }    
      }
}
*/
//-------------------------------------------------------------------------------------------
/*15.	Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.
*
/*
import java.util.Scanner;
class Pr15
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int age=sc.nextInt();
	System.out.println("enter character for male");
	char m=sc.next();
	System.out.println("enter character for female");
	char f=sc.next();
	if(age>=21)
	{
	System.out.println("eligible for marriage");
	}
	else
        {
	System.out.println("Not eligible for marriage");
        }
        }
}
*/
      

