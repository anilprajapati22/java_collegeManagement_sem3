import java.util.*;
class sgn_main_login extends sgn_instructor_login
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int choice=10,a;
sgn_main_login mob=new sgn_main_login();
System.out.println(" ____________________________________________________________________");
System.out.println("|  ________________________________________________________________  | ");
System.out.println("| |    WELLCOME TO.                    _ _                         | | ");
System.out.println("| |                                   | | |                        | | ");   
System.out.println("| |    ___  __ _ _ __         ___ ___ | | | ___  __ _  ___         | | ");
System.out.println("| |   / __|/ _` | '_ \\       / __/ _ \\| | |/ _ \\/ _` |/ _ \\        | | ");
System.out.println("| |   \\__ \\ (_| | | | |     | (_| (_) | | |  __/ (_| |  __/        | | "); 
System.out.println("| |   |___/\\__, |_| |_|      \\___\\___/|_|_|\\___|\\__, |\\___|        | | ");
System.out.println("| |        __/ |                                __/ |              | | ");
System.out.println("| |       |___/                                |___/               | | ");
System.out.println("| |________________________________________________________________| | ");
System.out.println("|____________________________________________________________________| ");

System.out.println("\t\t\t WELLCOME TO SGN COLLEGE\n\n");

do{
System.out.println("\n\nenter a number");
System.out.println("(1)  for login as student ");
System.out.println("(2)  for login as instructor ");
System.out.println("(4)  for view  time table");

System.out.println("(10) for exit from Aplication"); 
choice=sc.nextInt();

                if(choice==1)
                    a=mob.student_main(1);
                else if(choice==2)
                    mob.instructor_main();
                else if(choice==4)
                {
                System.out.println("enter sem for viewing time table:");
                int m=sc.nextInt();
                    mob.time_table(m);
                }
                else if(choice==11)
                    {    }
                else if(choice!=10)                                      
                    System.out.println("wrong input enter again");

    }while(choice!=10);
}
}
