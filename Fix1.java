//=============================================String Assignment==========================================


import java.util.Scanner;

public class Six1 {
	public static void main(String[] args) {
		System.out.println("Enter any Sentence..");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s+' ';
		s = s.toUpperCase();
		int i, vc = 0, cc = 0, nc = 0, spc = 0, j;
		String s1 = "", s2 = "";

		for (j = 0; j < s.length(); j++)
		{
			if (s.charAt(j) == ' ') 
			{
			try {
					int a = Integer.parseInt(s2);
					nc++;
				} 
			catch (Exception e)
				{
				 s1 = s2;
				 s2 = "";
				 char ch[] = s1.toCharArray();
				for (i = 0; i < ch.length; i++)
				{
				 if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
						{
						vc++;
						} else if ((int) ch[i] < 65)
						{
							if(ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4'
							|| ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') 
							{
								nc++;
							} else
								spc++;
						} else
							cc++;
					}
				}
			}

			else
				s2 = s2 + s.charAt(j);
		}
		System.out.println("Vowels               :" + vc);
		System.out.println("Consonent            :" + cc);
		System.out.println("Numbers              :" + nc);
		System.out.println("Special  Chaactersr  :" + spc);
	}


//==============================================================================
import java.util.Scanner;

public class Six2{
	public static void main(String[] args) {
		System.out.println("Enter your Sentence....");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), s1 = "", s2 = "";
		int i;
		s = s + ' ';
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				switch (s2) {
				case "zero":s2="one";
				break;
				case "one":
					s2 = "two";
					break;
				case "two":
					s2 = "three";
					break;
				case "three":
					s2 = "four";
					break;
				case "four":
					s2 = "five";
					break;
				case "five":
					s2 = "six";
					break;
				case "six":
					s2 = "seven";
					break;
				case "seven":
					s2 = "eight";
					break;
				case "eight":
					s2 = "nine";
					break;
				case "nine":
					s2 = "ten";
					break;
				}

				s1 = s1.concat(s2);
				s1 = s1 + ' ';
				s2 = "";
			} else
				s2 = s2 + s.charAt(i);
		}
		System.out.println(s1);
		sc.close();

	}
}

//==========================================================================
import java.util.*;

public class Six3 {
	public static void main(String args[])
	{
		System.out.println("Enter any Sentence..");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String s1="";
		char a[]= s.toCharArray();
		int size = s.length();
		for(int i=0;i<size-1;i++)
		{
		if(a[i]==a[i+1])
		{
			a[i]=' ';
		
		}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]!=' ')
			{
				s1=s1+a[i];
			}
		}
		System.out.println(s1);
		}

}
//=================================================================================================
import java.util.Scanner;
public class Six4
{
	public static void main(String[] args) {
		System.out.println("Enter the your Sentence...");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
	//	String s1="";
		char ch[] = s.toCharArray();
		int j, i,c = 0;
		int l = ch.length; 
		for (i = 0; i < l; i++)
		{
			for (j = 0; j < l; j++)
			{
				if (ch[i] == ch[j])
					c++;
			}
			if (c == 1)
			{
				System.out.println("Single character in the sentence is  ::");
				System.out.println();
				System.out.println(ch[i]);
			break;
			}
				c = 0;			
		  }
		
	}
}
//=======================================================================================

import java.util.Scanner;

class Six5
{ 
	static void count(String line) 
	{ 
 
		char[] ch = line.toCharArray(); 
		for (int i = 0; i < ch.length; i++)
		{ 
			String s = ""; 
			while (i < ch.length && ch[i] != ' ')
			{
				s = s + ch[i]; 
				i++; 
		} 
			if ( s.length () > 0) 
				System.out.println(s + " : " + s.length());			 
		} 
}

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter any Sentence .....");
        String line =sc.nextLine();
        sc.close();
        
		count(line); 
	} 
 //==============================================================================================
import java.util.Scanner;

public class Six6 {
	public static void main(String args[]) 
{ 
		System.out.println("Enter your Sentence....");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		if(s.length()%3==0)
		{ 
			int k=s.length()/3;
			String s1=s.substring(0,k);
			for(int i=0;i<s.length();i=i+k)
			{
				if(s1.equalsIgnoreCase(s.substring(i, i+k)))
				{
					c++;
				}
			}
			System.out.println("True :: three times is repeating character present in string ");
		}
		else
		System.out.println("False");
        sc.close();
}
}
//===========================================================================================
import java.util.Scanner;
class Six7{ 
	
	static void caseChange(StringBuffer string) 
	{ 
		int n = string.length(); 
		for (int i=0; i<n; i++) 
		{ 
			Character c = string.charAt(i); 
			if (Character.isLowerCase(c)) 
				string.replace(i, i+1, Character.toUpperCase(c)+""); 
			else
				string.replace(i, i+1, Character.toLowerCase(c)+""); 
			
		} 
	} 
	
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that you want reverse ");
		String s=sc.nextLine();
		StringBuffer string = new StringBuffer(s); 
		caseChange(string); 
		System.out.println(string); 
		sc.close();
		} 
} 
//==============================================================================
import java.util.Scanner;
public class Six8
{
	
   public static String reverseString(String str)
   {
    
      char ch[] = str.toCharArray();
      int n = ch.length;
      char result[] = new char[n];
      for(int i = 0; i<ch.length; i++) {
         result[n-1] = ch[i];
         n = n - 1;
      }
      return new String(result);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.nextLine();
      String result = Solution8.reverseString(str);
      System.out.println(result);
      sc.close();
   }
}
//======================================================
import java.util.*; 

class Six9 
{ 
           	static int max=26;
			static void same(String string1,int l1,String string2,int l2) 
		{   
			int present[] = new int[max]; 
			for (int i = 0; i < max; i++) 
			{ 
				present[i] = 0; 
			} 
 
			for (int i = 0; i < l1; i++) 
			{ 
				present[string1.charAt(i) - 'a'] = 1; 
			} 
			for (int i = 0; i < l2; i++) 
			{ 
				if (present[string2.charAt(i) - 'a'] == 1
					|| present[string2.charAt(i) - 'a'] == -1) 
				{ 
					present[string2.charAt(i) - 'a'] = -1; 
				} 
				else
				{ 
					present[string2.charAt(i) - 'a'] = 2; 
				} 
			} 
			for (int i = 0; i < max; i++) 
			{ 
				if (present[i] == -1 || present[i] == -1) 
				{ 
					System.out.print((char) (i + 'a') + " "); 
				} 
			} 
		} 




public static void main(String args[]) 
{ 
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String1 value: ");
      String string1 = sc.nextLine();
      System.out.println("Enter a String2 value: ");
      String string2 = sc.nextLine();
      int l1 = string1.length();
      int l2 = string2.length(); 
	  same(string1, l1, string2, l2); 
	  sc.close();
} 
} 
