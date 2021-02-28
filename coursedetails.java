import java.util.*;
class coursedetails extends hosteldetails
{ 
	
	void heading()
	{
		System.out.println("\t\t\t\t\t\t\t**********Course Details**********");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t*                                *");
		System.out.println("\t\t\t\t\t\t\t**********************************");
	}
 	void semester(int d)
	{
	//	System.out.println("Enter your Semester Number");
	//	Scanner sc=new Scanner(System.in);
	//	=sc.nextInt();
		System.out.println("Your semester "+d);
		semres(d);
		
	}
	void semres(int sem)
	{	
		if(sem==3)
		{
			System.out.println("The subjects in Semester 3 are\n\n");
			sem3();
		}
		else if(sem==5)
		{
			System.out.println("The subjects in Semester 5 are\n\n");
			sem5();			
		}
		else if(sem==7)
		{
			System.out.println("The subjects in Semester 7 are\n\n");
			sem7();
		}
		else
		{
			System.out.println("Please enter correct details\n");
			semester(sem);
		}
	}
	void sem3()
	{
		System.out.println("(1) AEM (Applied Engineering Mathematics)");
		System.out.println("(2) DS (Data Structure)");
		System.out.println("(3) OOP (Object Oriented Programming)");
		System.out.println("(4) EE (Economics Engineering)");
		System.out.println("(5) DBMS (Database Managment System)");
	}
	void sem5()
	{
		System.out.println("\t\t1) Python");
		System.out.println("\t\t2) M&M");
		System.out.println("\t\t3) Advanced Java");
	}
	void sem7()
	{
		System.out.println("\t\t1) WD (Web Development)");
		System.out.println("\t\t2) Data Mining");
		System.out.println("\t\t3) Cloud Development");
	}
	public static void main(String args[])
	{
		coursedetails cd=new coursedetails();
		cd.heading();
		cd.semester(2);
	}
}
