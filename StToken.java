import java.util.Scanner;
import java.util.StringTokenizer;
class customer
{
    String name,dob;
    Scanner s=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter dob in dd/mm/yyyy format");
        dob=s.next();
    }
    void get()
    {
        StringTokenizer st=new StringTokenizer(dob,"/");
        System.out.print(name+",");
        while(st.hasMoreTokens())
        {
            String val=st.nextToken();
            System.out.print(val);
            if(st.countTokens()!=0)
            System.out.print(" "+",");
        }
    }
}
class StToken
{
    public static void main(String args[])
    {
        customer c=new customer();
        c.read();
        System.out.println("Customer details");
        System.out.println("------------------------");
        c.get();
        
    }
}



