import java.util.Scanner;
class Student
{
    String name,usn,branch,ph;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter usn:");
        usn=s.next();
        System.out.println("Enter branch:");
        branch=s.next();
        System.out.println("Enter phone number:");
        ph=s.next();
        System.out.println("\n");
    }
    void getdetails()
    {
        System.out.println("Student details are");
        System.out.println("Name:"+name+"\nUSN:"+usn+"\nBranch:"+branch+"\nPhone Number:"+ph);
    }
}
public class StudentDemo
{
    public static void main(String args[])
    {
        int n;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of students");
        n=sobj.nextInt();
        Student st[]= new Student[n];
        for(int i=0;i<n;i++)
        {
            st[i]=new Student();
        }
        for(int i=0;i<n;i++)
        {
        st[i].read();
        }
        for(int i=0;i<n;i++)
        {
        st[i].getdetails();
        }
    }
}
