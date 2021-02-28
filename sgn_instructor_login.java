//done all work but remaining do while loops in password login
import java.util.*;
class sgn_instructor_login extends sgn_student_login1
{
int passwd;
String name;
int id;
String ph_no;
String subject;
String e_mail;
String address;
int t_sem;
public void set_data_instructor(int id,int t_sem,String name,int passwd,String ph_no,String subject,String e_mail,String address)
{//to give instructor data
this.id=id;
this.t_sem=t_sem;
this.name=name;
this.passwd=passwd;
this.ph_no=ph_no;
this.subject=subject;
this.e_mail=e_mail;
this.address=address;
}

   public int instructor_login(int password,int i)
    {  
       if(password==passwd && id==i)
        {
        //System.out.println("password is correct\n\n");
        System.out.println("instructor name is :\t\t\t"+name);
        System.out.println("instructor id is :\t\t\t"+id);
        System.out.println("instructor phone number is :\t\t"+ph_no);
        System.out.println("instructor subject teaching is :\t"+subject);
        System.out.println("instructor email_id is :\t\t"+e_mail);
        System.out.println("instructor address is :\t\t\t"+address);
        System.out.println("instructor teaching in sem  :\t\t"+t_sem);
        return 1;
        }
    return 0;
    
    }
    public int instructor_main()
    {
    System.out.println("\t\t\t\t################################################");
    System.out.println("\t\t\t\t#         LOGIN PAGE FOR INSTRUCTOR            #");
    System.out.println("\t\t\t\t################################################");
    int x=0;
    sgn_instructor_login iob[]=new sgn_instructor_login[4];
    iob[0]=new sgn_instructor_login();
    iob[1]=new sgn_instructor_login();
    iob[2]=new sgn_instructor_login();
    iob[3]=new sgn_instructor_login();
//public void set_data_instructor(int id,int t_sem,String name,int passwd,String ph_no,String subject,String e_mail,String address)    
    iob[0].set_data_instructor(111,1,"anil prajapati",1,"9904382273","dbms","@gmail.com","add");
    iob[1].set_data_instructor(112,3,"anil prajapati ganeshbhai",2,"134578765","ds","@gmail.com","add");
    iob[2].set_data_instructor(113,5,"anil prajapati ritaben",3,"134578765","oop","@gmail.com","add");
    iob[3].set_data_instructor(114,7,"prajapati",4,"134578765","aem","@gmail.com","add");
    Scanner sc=new Scanner(System.in);  
    System.out.println("enter instructor id : \n");
    int id_i=sc.nextInt();
    System.out.println("enter password : \n");
    int p=sc.nextInt();
  
    for(int i=0;i<=3;i++)
    {
   x=iob[i].instructor_login(p,id_i);

    if(x==1)
    {
    int m=0;
    do{
     System.out.println("\n\npassword is correct \n\n");
     System.out.println("enter 1 for see your time table");
     System.out.println("enter 2 for see student details");
     System.out.println("enter 3 for log out ");
    m=sc.nextInt();
        if(m==1)
        {
            sgn_time_table time1=new sgn_time_table();
            time1.time_table(iob[i].t_sem); 
        }
        else if(m==2)
        {
               sgn_student_login1 ob=new sgn_student_login1();
               System.out.println("enter student id :");
               int id_s=sc.nextInt();
              int f=ob.student_main_instructor(id_s);
  
               if(f==0)
               System.out.println("enter id is not match");
              // return 0;
        }
        }while(m!=3); 
    }
    else if(x==1)
    break;
    else if(i==3 && x==0)
    System.out.println("password incorrect");

     }
    return 0;
    }
public static void main(String s[])
{
 
}
}

