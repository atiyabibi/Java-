import java.util.Scanner;
class Staff
{
    String sid,name,ph;
    float sal;
    void putdetails()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        name=s.next();
        System.out.println("Enter id:");
        sid=s.next();
        System.out.println("Enter phonne number:");
        ph=s.next();
        System.out.println("Enter salary");
        sal=s.nextFloat();
    }
    void getdetails()
    {
        System.out.println("Name:"+name+"\nID:"+sid+"\nPhone Number:"+ph+"\nSalary:"+sal);
    }
}
class Teaching extends Staff
{
    String dom,pub;
    Teaching()
    {
        putdetails();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Domain:");
        dom=s.next();
        System.out.println("Enter publications:");
        pub=s.next();
    }
    void dispteach()
    {
        getdetails();
        System.out.println("Domain:"+dom+"\nPublications"+pub);
    }
}
class Technical extends Staff
{
    String skill;
    Technical()
    {
        Scanner s=new Scanner(System.in);
        putdetails();
        System.out.println("Enter skills");
        skill=s.next();
    }
    void disptech()
    {
        getdetails();
        System.out.println("Skills:"+skill);
    }
}
class Contract extends Staff
{
    int period;
    Contract()
    {
        Scanner s=new Scanner(System.in);
        putdetails();
        System.out.println("Enter the period in yrs");
        period=s.nextInt();
    }
    void dispcontract()
    {
        getdetails();
        System.out.println("Years:"+period);
    }
}
class Demo
{
    public static void main(String args[])
    {
    System.out.println("Enter the deatails of teaching staff");
    Teaching t1=new Teaching();
    System.out.println("Enter the deatails of technical staff");
    Technical t=new Technical();
    System.out.println("Enter the deatails of contract based staff");
    Contract c=new Contract();
    System.out.println("Teaching staff");
    t1.dispteach();
    System.out.println("Technical staff");
    t.disptech();
    System.out.println("Contract based staff");
    c.dispcontract();
    }
}

