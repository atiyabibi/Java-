import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    double a,b;
	    System.out.println("Enter two numbers");
	    a=s.nextDouble();
	    b=s.nextDouble();
	    char ch;
	    System.out.println("Enter the operator");
	    ch=s.next().charAt(0);
	    switch(ch)
	    {
	        case '+':
	            System.out.println("Addition of two numbers "+(a+b));
	            break;
	       case '-':
	           System.out.println("Subtraction of two numbers "+(a-b));
	           break;
	       case '*':
	           System.out.println("Multiplication of two numbers "+(a*b));
	           break;
	       case '/':
	           if(b!=0)
	           System.out.println("Division of two numbers "+(a/b));
	           else
	           System.out.println("Error! Division by zero");
	           break;
	       case '%':
	           if(b!=0)
	           System.out.println("Remainder operation "+(a%b));
	           else
	           System.out.println("Error! Division by zero");
	           break;
	       default:System.out.println("Unkown operator! Please choose the valid operator");
	   }
	}
}
