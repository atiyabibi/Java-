import java.util.Scanner;
class subset
{
    static int c=0;
    static int w[]=new int[10];
    static int x[]=new int[10];
    static int n,sum=0,i,d;
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elemnts");
        n=s.nextInt();
        System.out.println("Enter the value of elements in ascending order");
        for(i=0;i<n;i++)
        w[i]=s.nextInt();
        for(i=0;i<n;i++)
        sum=sum+w[i];
        System.out.println("Enter the value of d:");
        d=s.nextInt();
        if(sum<d || w[0]>d)
        {
            System.out.println("subset is not possible");
            System.exit(0);
        }
        subset(0,0,sum);
        if(c==0)
        System.out.println("subset is not possible");
    }
    static void subset(int wsf, int k, int trw)
    {
        int i;
        x[k]=1;
        if(wsf+w[k]==d)
        {
            System.out.println("Subset solution"+(++c));
            for(i=0;i<=k;i++)
            {
                if(x[i]==1)
                System.out.println(w[i]);
            }
            return;
        }
        if(wsf+w[k]+w[k+1]<=d)
        subset(wsf+w[k],k+1,trw-w[k]);
        if((wsf+trw-w[k]>=d)&&(wsf+w[k+1]<=d))
        {
            x[k]=0;
            subset(wsf,k+1,trw-w[k]);
        }
    }
}
