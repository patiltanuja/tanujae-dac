//Assignment 5
class Bank{
	String name="SBI";
	String id="SBIN0000123";
	String branch="Pune";
	void detail_b()
	{
		System.out.println("Im Bank...");
	}
}
class customer extends Bank{
	String c_name="James";
	String ac_no="123456";
	String acc_type="saving";
	
	void detail_c()
	{
		System.out.println("Im customer...");
	}
}
public class Solution1 {

	public static void main(String[] args) {
		customer c=new customer();
		System.out.println(c.ac_no);
		System.out.println(c.acc_type);
		System.out.println(c.branch);
		System.out.println(c.c_name);
		System.out.println(c.id);
		System.out.println(c.name);
		c.detail_b();
		c.detail_c();

	}

}
//========================================
class Employee{
	String compony_name="PKL";
	void print()
	{
		System.out.print("I am Employee");
	}
}
class Manager extends Employee{
	String id="PE_123";
	void print1()
	{
		System.out.println(" manager.");
	}
}
class Worker extends Employee{
	String id="w_456";
	void print2()
	{
		System.out.println(" worker.");
	}
}
public class Solution2 {
	public static void main(String args[])
	{
		Worker w=new Worker ();
		System.out.println(w.compony_name);
		System.out.println(w.id);
		w.print();
		w.print2();
		

		Manager m=new Manager ();
		System.out.println(m.compony_name);
		System.out.println(m.id);
		m.print();
		m.print1();
		
		
	}

}
//=============================================
interface School{
	public abstract  void display();
	
}
class Teacher implements School
{
	public void display()
	{
		System.out.println("I am Teacher in school.");
	}
}
class Student implements School
{
	public void display()
	{
		System.out.println("I am Student in school.");
	}
}
public class Solution3 {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		
		Teacher t=new Teacher();
		t.display();

	}

}
//===============================================
interface Collage{
	public abstract  void collage_detail();
	
}
interface Exam{
	public abstract  void exam_detail();
	
}
class Students implements Collage,Exam
{
	public void collage_detail()
	{
		System.out.println("I am student of CDAC Mumbai..");
	}
	
	public void exam_detail()
	{
		System.out.println("My exam on 9 Novwmber 2020...");
	}
}
public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students s=new Students();
s.collage_detail();
s.exam_detail();
		
	}

}
//=====================================
interface Compony{
	public abstract  void payment();
	
}
class Employees{
	String emp_name="Jack";
	void print()
	{
		System.out.println("I am Employee..");
	}
}

class Salary extends Employees implements Compony{
	String emp_salary="50000";
	public void payment()
	{
		System.out.println("My salary is recived...Thank you!!");
	}
}

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s= new Salary();
		System.out.println(s.emp_name);
		s.print();
		System.out.println(s.emp_salary);
		s.payment();

	}

}
