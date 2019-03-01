import java.util.Scanner;

class employee
{
            String name,lname;
			double salary;	
			
		  employee()
		  {
			  name="first name";
			  lname="last name";
			  salary=0.0;
		  }		  
			
		void get()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name=");
		   name=sc.next();
		   
		   System.out.println("Enter last name=");
		   lname=sc.next();
		   
		   System.out.println("Enter salary=");
		   salary=sc.nextDouble();	
		}
		
		void set()
		{
			System.out.println("\n employee details is=");
			System.out.println("name is="+name);
			System.out.println("last name is="+lname);
			System.out.println("salary is="+salary);
		}
		
		void calsalary()
		{
			salary=(salary+(salary)*(0.1))*1.2;
		}
}

class testapplication
{
	public static void main(String args[])
	{
		employee e1=new employee();
		
		System.out.println("enter first employee details");
		e1.get();
         e1.set();	
		 
		 System.out.println("\n details after incremented salary");
		 e1.calsalary();
		 e1.set();
		 
		 System.out.println("*************************************");
		 employee e2=new employee();
		 System.out.println("\n enter second employee details");
		e2.get();
         e2.set();	
		 
		 System.out.println("\n details after incremented salary");
		 e2.calsalary();
		 e2.set();
	}
	
}
