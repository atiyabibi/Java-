import java.util.Scanner;
class Stack
{
    int size=10;
    int arr[]=new int[size];
    int top=-1;
    void push(int item)
    {
        if(top==size-1)
        {
            System.out.println("Error! Stack overflow");
        }
        else
        {
            top++;
            arr[top]=item;
            System.out.println("The item "+item+" is pushed  in the stack");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Error! Stack underflow");
        }
        else
        {
            int item;
            item=arr[top];
            System.out.println("The item \t"+arr[top]+"is popped out of the stack");
            top--;
        }
    }
    void display()
    {
        if (top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("The stack content is");
            for(int i=0;i<=top;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
public class StackDemo
{
    public static void main(String args[])
    {
        int x,ch;
        Scanner s=new Scanner(System.in);
        Stack st=new Stack();
        System.out.println("Enter 1 to push the element \nEnter 2 to pop an element \nEnter 3 to display \nEnter 4 to exit ");
    
        do{
            System.out.println("Enter your choice");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter the element to be pushed");
                x=s.nextInt();
                st.push(x);
                break;
                case 2:st.pop();
                break;
                case 3:st.display();
                break;
                case 4:System.exit(0);
                break;
                default:System.out.println("Please enter valid choice");
            }
        }while(ch!=4);
    }
}

