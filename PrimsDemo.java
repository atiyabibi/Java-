import java.util.Scanner;
class Prims 
{
    int n,c[][],st[][];
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n=s.nextInt();
        c=new int[n+1][n+1];
        System.out.println("Enter the cost of adjacency matrix");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                c[i][j]=s.nextInt();
            }
        }
    }
    void primsalg()
    {
        int nr[],w,i,u=0,j,min,mincost=0;
        st=new int[n+1][3];
        nr=new int[n+1];
        for(i=1;i<=n;i++)
        
        nr[i]=1;
        nr[1]=0;
        
        for(i=1;i<n;i++)
        {
            min=999;
            for(j=1;j<=n;j++)
            {
               if(nr[j]!=0 && c[j][nr[j]]<min)
            	{
					min=c[j][nr[j]];
					u=j;
				}
			}
            st[i][1]=u;
            st[i][2]=nr[u];
            mincost+=c[u][nr[u]];
            nr[u]=0;
            for(w=1;w<=n;w++)
            {
                if(nr[w]!=0 && c[w][nr[w]]>c[w][u])
                nr[w]=u;
            }
        }
        System.out.println("The minimum cost spanning tree is:");
        for(i=1;i<=n-1;i++)
        System.out.println(st[i][1]+"->"+st[i][2]);
        System.out.println("Minimum cost:"+mincost);
    }
}
public class PrimsDemo
{
    public static void main(String args[])
    {
        Prims p=new Prims();
        p.read();
        p.primsalg();
    }
}
