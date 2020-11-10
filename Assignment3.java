import java.util.Scanner;

 class Student{
	int rollno;
	String name;
	int mark;
	
	 void set_data()
	 {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Roll number: ");
			rollno=sc.nextInt();
            sc.nextLine();
			System.out.println("Enter the Name: ");
			name=sc.nextLine();
			//sc.nextLine();
			System.out.println("Enter the Mark: ");
			mark=sc.nextInt();
		    sc.close();
	 }
		 
	void display_data()
	{
	System.out.println("Roll Number: "+rollno);	
	System.out.println("Name      : "+name);	
	System.out.println("Mark      : "+mark);	
	}
	
	}
public class Solution1 {

	public static void main(String[] args)
	{
	
		Student s1=new Student();
	    Student s2=new Student();
		s1.set_data();
		s2.set_data();
		s1.display_data();
	    s2.display_data();
	    
}

}
//============================
package Static_Dynamic_Polymorphisum;

import java.util.Scanner;

class Book {
	int id;
	String name;
	double price;
	
	Book(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("Id = "+this.id);
		System.out.println("Book Name = "+this.name);
		System.out.println("Price = "+this.price);
	}
	
}
public class Books {
	
	
	
	
	
	void giveHighestPrice(Book[]  b) {
	double max=b[0].price;
		for(int i=0;i<b.length;i++) {
			if(max<b[i].price)max=b[i].price;
		}	
		
		
		System.out.println("Maximun Price : "+max);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("no of book detail to be enter");
        int n=sc.nextInt();
        Book arr[]=new Book[n];
        System.out.println("Scanning values ");
        for(int i=0;i<n;i++) {
        	System.out.println("Enter "+i+" book id");
        	 int id=sc.nextInt();
        	System.out.println("Enter "+i+" book name");   
        	//sc.next();
        	 String name=sc.next();
        	System.out.println("Enter "+i+" book price");
        	 double price=sc.nextDouble();
        	 
        	 arr[i]=new Book(id,name,price);
        }
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i].id);
        	System.out.println(arr[i].name);
        	System.out.println(arr[i].price);
        		
        }		
		
        
        
        Books obj=new Books();
        obj.giveHighestPrice(arr);
	}

}
//===================================================
import java.util.*;

class Account{
    String name;
    String acc_type;
    int Acc_num;
    int Acc_Balance;
    
    Account()
    {
      
    }
      Account(String ac_name,int acc_num,int balance,String type)
        {
            name=ac_name;
            Acc_num=acc_num;
            Acc_Balance=balance;
            acc_type=type;
        }
} 

class create_account extends Account{
    create_account(String n,int acc_num,int b,String a_t)
    { 
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
    }
    create_account(){
        super();
    }
        
    void insert(String n,int acc_num,String a_t)
    {
        name=n;
        acc_type=a_t;
        Acc_num=acc_num;
        Acc_Balance=0;
    }
    
    void display_details()
    {
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+Acc_num);
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Account Type : "+acc_type);
    }
 
        void deposite(int acc_num,int money)
        {                 
                Acc_Balance=money;    
        }
        
        int withdraw(int withd)
        {
		if(Acc_Balance<=1000)
		{
		 System.out.println("Your Balance in Minimum.You Can not Withdraw");
		 }
		else
                Acc_Balance=Acc_Balance-withd;
                return Acc_Balance;
        }
  
} 



      
public class Solution3 {
    public static void main(String args[]){
        String user_name=null,type;
        type = null;
        int balance=0,tmp=0;
        int withd=0,cb=0;
 
        int aNumber = 0; 
        aNumber = (int)((Math.random() * 9000)+1000); 

        create_account user = new create_account("user",0,0,"savings");
    
            Scanner in = new Scanner(System.in);
            Scanner strng=new Scanner(System.in);
            int userChoice;
            boolean quit = false;

            do {
                  System.out.println("1. Create Account");
                  System.out.println("2. Deposit money");
                  System.out.println("3. Withdraw money");
                  System.out.println("4. Check balance");
                  System.out.println("5. Display Account Details");
                  System.out.println("0. to quit: \n");
                  System.out.print("Enter Your Choice : ");
                  userChoice = in.nextInt();
                  
                  
            switch (userChoice)
            {
                      
                  case 1:
                        System.out.print("Enter your Name : ");
                        user_name= strng.nextLine(); 
                        System.out.print("Enter Accout Type : ");
                        type=in.next();
                        user.insert(user_name, aNumber, type); 
                        System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
                        System.out.println(".................................................");                       
                        user.display_details();
                        break;
                      
                case 2:
                    System.out.print("Enter your account Number : ");
                    tmp=in.nextInt();
                 if(tmp==user.Acc_num){
                 System.out.print("Enter Amount Of Money : ");
                 balance=in.nextInt();
                 user.Acc_Balance=balance;
                 System.out.println("\t Successfully Deposited.");
              }                
                     else
                    System.out.println("Wrong Accoount Number.");          
                   break;
                    
                  case 3:                     
                     System.out.print("Enter your account Number : ");
                      tmp=in.nextInt();
                      
                          if(tmp==user.Acc_num){                         
                             if(user.Acc_Balance==0)
                             System.out.print("Your Account is Empty.");
                             
                             else{
                             System.out.print("Enter Amout Of Money : ");   
                             withd=in.nextInt();  
                             
                             if(withd>user.Acc_Balance){
                             System.out.print("Enter Valid Amout of Money : ");
                             withd=in.nextInt();
                             }
                             else
                             cb= user.withdraw(withd);
                             System.out.println("Your Current Balance : "+cb);   
                             }
                          }
                             else
                             System.out.println("Wrong Accoount Number.");  
                        break;
     
                  case 4:

                      System.out.print("Enter your Account Number : ");
                      tmp=in.nextInt();
                      
                             if(tmp==user.Acc_num){
                             System.out.println("Your Current Balance : "+user.Acc_Balance);
                             }
                             else
                             System.out.println("Wrong Accoount Number.");                         
                      break;
                      
                  case 5:
                          
                      System.out.print("Enter your Account Number :");
                      tmp=in.nextInt();                     
                             if(tmp==user.Acc_num){                               
                             user.display_details();                             
                        }else
                             System.out.println("Wrong Accoount Number.");
                             
                      break;
                      
                  case 0:
                        quit = true;
                        break;
                        
                  default:
                        System.out.println("Wrong Choice.");
                        break;
                  }
            
                  System.out.println("\n");
            } 
             
            
            while (!quit);
            System.out.println("Thanks !");
            in.close();
            strng.close();
             
     } 
    
}
//============================
//================================
import java.util.Scanner;

 class Employee
 {
 int empid;
 String name;
 String designation;
 
 public void getDetail() 
 {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Employee ID :: ");
  empid = sc.nextInt();
  sc.nextLine();
  System.out.print("Enter the Employee Name :: ");
  name = sc.nextLine();
  System.out.print("Enter the Designation :: ");
  designation = sc.nextLine(); 
 }
 
 public void display()
 {
    System.out.println("Employee id = " + empid);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " +designation);
 }
 
  }
 class Solution4{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);	 
  System.out.println("Enter the value for number of Employee that you want:");
  int n=sc.nextInt();
  
  
  Employee e[] = new Employee[n];
  for(int i=0; i<n; i++) 
  {
      e[i] = new Employee();
      e[i].getDetail();
  }
    System.out.println("");
    for(int i=0; i<n; i++)
    {
      e[i].display();
   }
   System.out.println("Manager's detail are as follows:");
    for(int i=0; i<n; i++)
    {
    	String input = "manager";
     if (e[i].designation==input)
     {
    	 System.out.println(e[i]);
     }
   }
    sc.close();
 }
 }
 //========================
import java.util.Scanner;

 class SimpleIntrest
 {
 double principle_amount;
 double time;
 static double intrest_rate=12;
 
 public void getDetail() 
 {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter the principle_amount :: ");
  principle_amount = sc.nextDouble();
  System.out.print("Enter Time Period in years:: ");
  time = sc.nextDouble();
 
 }
 
 public void display()
 {
	 double si;
  System.out.println(" Principle Amount    = " + principle_amount);
  System.out.println(" Time                = " + time);
  System.out.println(" Fixed Intrest Rate = " +intrest_rate);
  System.out.println(" Simple Intrest     = " +(si=(principle_amount*time*intrest_rate)/100));
 }
 
  }
 class Solution5{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);	 
  System.out.println("Enter the value for number of Simple Interest  that you count:");
  int n=sc.nextInt();
  
  
  SimpleIntrest si[] = new SimpleIntrest[n];
  for(int i=0; i<n; i++) 
  {
      si[i] = new SimpleIntrest();
      si[i].getDetail();
  }
    System.out.println("");
    for(int i=0; i<n; i++)
    {
      si[i].display();
   }
   
    sc.close();
 }
 }
 
//====================================
import java.util.Scanner;
class Complex { 

	int real;
	int imaginary; 

	Complex() 
	{ 
	} 

	Complex(int real, int imaginary) 
	{ 
		this.real = real; 
		this.imaginary = imaginary; 
	} 

	Complex addComp(Complex C1, Complex C2) 
	{ 
		Complex temp = new Complex(); 
		temp.real = C1.real + C2.real; 
		temp.imaginary = C1.imaginary + C2.imaginary; 
		return temp; 
	} 
} 

public class Solution6 { 
		public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for 1st Real Part");
		int a=sc.nextInt();
		System.out.println("Enter the value for 1st Imaginary Part");
		int b=sc.nextInt();
		System.out.println("Enter the value for 2nd Real Part");
		int c=sc.nextInt();
		System.out.println("Enter the value for 2nd Imaginary Part");
		int d=sc.nextInt();
		sc.close();
		
		Complex C1 = new Complex(a,b ); 
		System.out.println("Complex number 1 : "+ C1.real + " + i"+ C1.imaginary); 
		
		Complex C2 = new Complex(c, d); 
		System.out.println("Complex number 2 : "+ C2.real + " + i"+ C2.imaginary); 
		Complex C3 = new Complex(); 
		
        C3 = C3.addComp(C1, C2); 
    	System.out.println("Sum of complex number : "+ C3.real + " + i"+ C3.imaginary); 
	} 
} 
