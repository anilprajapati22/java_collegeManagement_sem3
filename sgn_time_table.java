import java.util.*;
class sgn_time_table extends coursedetails
{

void set_sem1()
{
System.out.println("                        time table (sem 1)");
System.out.println("time            monday      tuesday     wedenday    thursday    friday");
System.out.println("7:25 to 8:20    A.E.M       A.E.M       D.S.        LAB         LAB");
System.out.println("8:20 to 9:15    O.O.P       O.O.P       D.S.        LAB         LAB");
System.out.println("9:30 to 10:15   LAB         LAB         D.S.        LAB         LAB");
System.out.println("10:15 to 11:05  D.B.M.S     LAB         D.S.        LAB         LAB");
System.out.println("11:30 to 12:45  LAB         LAB         D.S.        LAB         LAB");
System.out.println("12:45 to 1:10   D.S.        LAB         D.S.        LAB         LAB");
}
void set_sem3()
{
System.out.println("                        time table (sem 3)");
System.out.println("time            monday      tuesday     wedenday    thursday    friday");
System.out.println("7:25 to 8:20    A.E.M       A.E.M       D.S.        LAB         LAB");
System.out.println("8:20 to 9:15    O.O.P       O.O.P       D.S.        LAB         LAB");
System.out.println("9:30 to 10:15   LAB         LAB         D.S.        LAB         LAB");
System.out.println("10:15 to 11:05  D.B.M.S     LAB         D.S.        LAB         LAB");
System.out.println("11:30 to 12:45  LAB         LAB         D.S.        LAB         LAB");
System.out.println("12:45 to 1:10   D.S.        LAB         D.S.        LAB         LAB");
}
void set_sem5()
{
System.out.println("                        time table (sem 5)");
System.out.println("time            monday      tuesday     wedenday    thursday    friday");
System.out.println("7:25 to 8:20    A.E.M       A.E.M       D.S.        LAB         LAB");
System.out.println("8:20 to 9:15    O.O.P       O.O.P       D.S.        LAB         LAB");
System.out.println("9:30 to 10:15   LAB         LAB         D.S.        LAB         LAB");
System.out.println("10:15 to 11:05  D.B.M.S     LAB         D.S.        LAB         LAB");
System.out.println("11:30 to 12:45  LAB         LAB         D.S.        LAB         LAB");
System.out.println("12:45 to 1:10   D.S.        LAB         D.S.        LAB         LAB");
}
void set_sem7()
{
System.out.println("                        time table (sem 7)");
System.out.println("time            monday      tuesday     wedenday    thursday    friday");
System.out.println("7:25 to 8:20    A.E.M       A.E.M       D.S.        LAB         LAB");
System.out.println("8:20 to 9:15    O.O.P       O.O.P       D.S.        LAB         LAB");
System.out.println("9:30 to 10:15   LAB         LAB         D.S.        LAB         LAB");
System.out.println("10:15 to 11:05  D.B.M.S     LAB         D.S.        LAB         LAB");
System.out.println("11:30 to 12:45  LAB         LAB         D.S.        LAB         LAB");
System.out.println("12:45 to 1:10   D.S.        LAB         D.S.        LAB         LAB");
}

   public void time_table(int a)
    {
    
    System.out.println("\t\t################################################");
    System.out.println("\t\t#             TIME TABLE                       #");
    System.out.println("\t\t################################################\n\n");
    if(a==1)
    set_sem1();   
    if(a==3)
    set_sem3();
    if(a==5)
    set_sem5();
    if(a==7)
    set_sem7();
    
         
    }
    public static void main(String args[])
    {
    }
    
}


