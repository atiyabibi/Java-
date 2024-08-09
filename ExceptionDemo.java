import java.util.Scanner;
class ExceptionDemo
{
    public static void main(String args[])
    {
        int a,b;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first number(numerator)");
        a=s.nextInt();
        System.out.println("Enter second number(denominator)");
        b=s.nextInt();
        try {
            if(b!=0)
            {
                int res=a/b;
                System.out.println("Result="+res);
            }
            else
            throw new ArithmeticException();
        } catch(ArithmeticException e) {
            System.out.println("divide by zero error");
        }
    }
}

