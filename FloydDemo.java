import java.util.*;
class Floyd
{
    int a[][]=new int[10][10];
    int d[][][]=new int[10][10][10];
    int n;
    void read()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n=s.nextInt();
        System.out.println("Enter the adjacency matrix");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
    }
    void write()
    {
        int i,k,j;
        System.out.println("Comparison of all shortest paths");
        for(k=0;k<=n;k++)
        {
            System.out.println("d["+k+"]<< = << \n");
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    System.out.print(d[k][i][j] +"\t");
                }
                System.out.println();
            }
        }
    }
    void floyds()
    {
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                d[0][i][j]=a[i][j];
            }
        }
        for(k=1;k<=n;k++)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    d[k][i][j]=min(d[k-1][i][j],d[k-1][i][k]+d[k-1][k][j]);
                }
            }
        }
    }
    int min(int a,int b)
    {
        if (a<b)
        return a;
        else
        return b;
    }
    
}
public class FloydDemo
{
    public static void main(String args[])
    {
        Floyd f=new Floyd();
        f.read();
        f.floyds();
        f.write();
    }
}
