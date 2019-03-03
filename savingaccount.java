import java.util.Scanner;
 class savingaccount
 {
    static int annual_interest_rate=4;
	double savingbalance=0.0;
	double si=0.0;
    void calculate_monthly_intrest()
	{
	  si=(savingbalance*annual_interest_rate)/(12*100);
	  System.out.println("simple interest is="+si);
	}
	public static void modify_interest_rate()
	{
	   annual_interest_rate=5;
	}
	void display()
	{
	   savingbalance=savingbalance+si;
	   System.out.println("saving balance is="+savingbalance);
	}
	savingaccount(int i)
	{ 
	   savingbalance=i; 
	}
    public static void main(String args[])
	{
	   savingaccount saver1=new savingaccount(2000);
	   savingaccount saver2=new savingaccount(3000);
	   System.out.println("\n simple interest rate is 4%");
	   saver1.calculate_monthly_intrest();
	   saver1.display();
	   saver2.calculate_monthly_intrest();
	   saver2.display();
	   modify_interest_rate();
	   System.out.println("\n new records");
	   System.out.println("\n simple interest rate is 5%");
	   saver1.calculate_monthly_intrest();
	   saver1.display();
	   saver2.calculate_monthly_intrest();
	   saver2.display();
	}
 }
