import java.util.Scanner;
class knaptest
{
    int n,m;
    int p[]=new int[10];
    int w[]=new int[10];
    int v[][]= new int[10][10];
    void input()
    {
        int i,j;
        System.out.println("Enter thr number of objects");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter the weight and profit of-------"+i+"--------object");
            w[i]=s.nextInt();
            p[i]=s.nextInt();
        }
        System.out.println("Enter the maximum capacity of knapsack");
        m=s.nextInt();
    }
    void opt_sol()
    {
        int i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=m;j++)
            {
                if(i==0||j==0)
                v[i][j]=0;
                else if (j<w[i])
                v[i][j]=v[i-1][j];
                else
                v[i][j]=max(v[i-1][j],v[i-1][j-w[i]]+p[i]);
            }
        }
    }
    int max(int a, int b)
    {
        return a>b?a:b;
    }
    void output()
    {
        int i,j,x[];
        x=new int[10];
        System.out.println("The optimal solution matrix is");
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=m;j++)
            {
               System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The value of op[timal olution is"+v[n][m]);
        for(i=0;i<=n;i++)
        x[i]=0;
        i=n;
        j=m;
        while(i!=0 && j!=0)
        {
            if(v[i][j]!=v[i-1][j])
            {
                x[i]=1;
                j=j-w[i];
            }
            i=i-1;
        }
        System.out.println("Objects selected are");
        for(i=0;i<=n;i++)
        {
            if(x[i]==1)
            System.out.println(i);
        }
    }
}
public class KnapsackDemo
{
    public static void main(String args[])
    {
        knaptest k=new knaptest();
        k.input();
        k.opt_sol();
        k.output();
    }
}






