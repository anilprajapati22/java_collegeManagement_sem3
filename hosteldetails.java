import java.util.*;
class hosteldetails
{
	Scanner sc=new Scanner(System.in);
	int city;
	int a;
	int b;
	void heading()
	{
		System.out.println("\t\t\t\t\t\t\t**********Hostel Details**********");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t**********************************");
	}
	void info()
	{
		System.out.println("Hostel facility is available in..");
		System.out.println("(1) Ranip");
		System.out.println("(2) Gota");
		System.out.println("At which place you are willing to avail the facitlity of Hostel");
		city=sc.nextInt();
		take();
	}
	void take()
		{
		if(city==1)
		{
			ranip();
		}
		else if(city==2)
		{
			gota();
		}
		else
		{
			System.out.println("Please choose the correct option");
			info();		
		}	
		}
	void ranip()
	{
		System.out.println("You have selected Ranip");
		System.out.println("Do you want AC or Non AC");
		System.out.println("For AC press 1");
		System.out.println("For Non AC press 2");
		a=sc.nextInt();
		showrout();
	}
	void showrout()
		{
		if(a==1)
		{
			System.out.println("Rent=5000");
			System.out.println("Maximum Sharing=4");
			System.out.println("Food Facility=Available");
			System.out.println("Laundry=extra charge(monthly=Rs.350)");
		}
		else if(a==2)
		{
			System.out.println("Rent=4000");
			System.out.println("Maximum Sharing=4");
			System.out.println("Food Facility=Available");
			System.out.println("Laundry=extra charge(monthly=Rs.350)");
		}
		else
		{
			System.out.println("Please choose correct option");
			ranip();		
		}
		}
	void gota()
		{
			System.out.println("You have selected Gota");
			System.out.println("Do you want AC or Non AC");
			System.out.println("For AC press 1");
			System.out.println("For Non AC press 2");
			b=sc.nextInt();			
			showgout();
		}
	void showgout()
		{
			if(b==1)
		{
			System.out.println("Rent=5500");
			System.out.println("Maximum Sharing=4");
			System.out.println("Food Facility=Available");
			System.out.println("Laundry=extra charge(monthly=Rs.350)");
		}
		else if(b==2)
		{
			System.out.println("Rent=4500");
			System.out.println("Maximum Sharing=4");
			System.out.println("Food Facility=Available");
			System.out.println("Laundry=extra charge(monthly=Rs.350)");
		}
		else
		{
			System.out.println("Please choose correct option");
			gota();		
		}
		}
	public static void main(String args[])
	{
		hosteldetails hd=new hosteldetails();
		hd.heading();
		hd.info();
	}
}
