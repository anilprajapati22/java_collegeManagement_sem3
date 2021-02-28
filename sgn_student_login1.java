//done all work but remaining do while loops in password login
import java.util.*;
class sgn_student_login1 extends sgn_time_table{
int passwd;
String name;
int id;
String ph_no;
String branch;
String e_mail;
String address;
int sem;
double grade;
public void set_data(double grade,int id,int sem,String name,int passwd,String ph_no,String branch,String e_mail,String address){//to give student data
this.id=id;
this.grade=grade;
this.sem=sem;
this.name=name;
this.passwd=passwd;
this.ph_no=ph_no;
this.branch=branch;
this.e_mail=e_mail;
this.address=address;
}
public int student_login(int password,int i){//to check id and password.
    if(password==passwd && id==i)
    {
    System.out.println("student id is :\t\t\t"+id);
    System.out.println("student name is :\t\t"+name);
    System.out.println("student sem is :\t\t"+sem);
    System.out.println("student branch is :\t\t"+branch);
    System.out.println("student phone number is :\t"+ph_no);
    System.out.println("student e_mail is :\t\t"+e_mail);
    System.out.println("student address is :\t\t"+address);
    return 1;
    }
    return 0;
}
public int student_login_instructor(int i){//to check id and password.
    if(id==i)
    {
    System.out.println("student id is :\t\t\t"+id);
    System.out.println("student name is :\t\t"+name);
    System.out.println("student sem is :\t\t"+sem);
    System.out.println("student branch is :\t\t"+branch);
    System.out.println("student phone number is :\t"+ph_no);
    System.out.println("student e_mail is :\t\t"+e_mail);
    System.out.println("student address is :\t\t"+address);
    return 1;
    }
    return 0;
}

public int student_main_instructor(int id_s)
{
    int x=0,i=0,m=0;
    sgn_student_login1 sob[]=new sgn_student_login1[4];
    sob[0]=new sgn_student_login1();
    sob[1]=new sgn_student_login1();
    sob[2]=new sgn_student_login1();
    sob[3]=new sgn_student_login1();
//public void set_data(int id,String name,int passwd,String ph_no,String branch,String e_mail,String address){//to give student data

    sob[0].set_data(9.23,101,1,"anil prajapati",1,"9904382273","CBA","@gmail.com","add");
    sob[1].set_data(8.2,102,3,"anil prajapati ganeshbhai",2,"134578765","BDA","@gmail.com","add");
    sob[2].set_data(7.2,103,5,"anil prajapati ritaben",3,"134578765","CS","@gmail.com","add");
       sob[3].set_data(6,104,7,"prajapati",4,"134578765","CS","@gmail.com","add");
    Scanner sc=new Scanner(System.in);
    for(i=0;i<=3;i++)
    {
    x=sob[i].student_login_instructor(id_s);
    if(x==1)
       break;
    }
    return x;
}
public int student_main(int h)
{
    System.out.println("\t\t################################################");
    System.out.println("\t\t#             LOGIN PAGE for student           #");
    System.out.println("\t\t################################################");

    int x=0,i=0,m=0,k=0;
    sgn_student_login1 sob[]=new sgn_student_login1[5];
    sob[0]=new sgn_student_login1();
    sob[1]=new sgn_student_login1();
    sob[2]=new sgn_student_login1();
    sob[3]=new sgn_student_login1();
    sob[4]=new sgn_student_login1();
//public void set_data(int id,String name,int passwd,String ph_no,String branch,String e_mail,String address){//to give student data

    sob[0].set_data(9.23,101,1,"anil prajapati",1,"9904382273","CBA","@gmail.com","add");
    sob[1].set_data(8.2,102,3,"anil prajapati ganeshbhai",2,"134578765","BDA","@gmail.com","add");
    sob[2].set_data(7.2,103,5,"anil prajapati ritaben",3,"134578765","CS","@gmail.com","add");
       sob[3].set_data(6,104,7,"prajapati",4,"134578765","CS","@gmail.com","add");

    Scanner sc=new Scanner(System.in); 
    System.out.println("enter id : \n");
    int id_s=sc.nextInt();
    System.out.println("enter password : \n");
    int p=sc.nextInt();
    
    for(i=0;i<=4;i++)
    {
    x=sob[i].student_login(p,id_s);
    if(x==1)
    {
   int g=0;
    do{
     System.out.println("\n\npassword is correct \n\n");
     System.out.println("enter 1 for see your time table");
     System.out.println("enter 2 for see your course details");
     System.out.println("enter 3 for select your hostel");
     System.out.println("enter 4 for log out");
    g=sc.nextInt();
        if(g==1)
        {
            sgn_time_table time1=new sgn_time_table();
            time1.time_table(sob[i].sem); 
        }
        else if(g==2)
        {
		coursedetails cd=new coursedetails();
		cd.heading();
		cd.semester(sob[i].sem);
        
        }
        else if(g==3)
        {
		hosteldetails hd=new hosteldetails();
		hd.heading();
		hd.info();
        
        }
        else if(g==4)
        {
        System.out.println("\nlog out\n\n");
        }
        }while(g!=4);
        return x;
}

     
     
      else if(x==0 && i==4)
     {
     System.out.println("\n\npassword is incorrect \n\n");
     return x;
     }
     }
     
    

    return 0;
    
}


public static void main(String args[])
{

}
}
