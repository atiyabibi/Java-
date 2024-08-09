import java.util.Scanner;
import java.util.Random;
class QS
{
    int n, a[];
    QS(int x)
    {
        n=x;
        a=new int[n];
    }
    void generate()
    {
        System.out.println("Generating n random numbers");
        Random r=new Random();
        for(int i=0;i<n;i++)
        {
            a[i]=r.nextInt(100);
            System.out.println(a[i]+" ");
        }
    }
    int partition(int a[],int lb,int ub)
    {
        int pi,down,up,temp;
        pi=a[lb];
        down=lb;
        up=ub;
        while(down<up)
        {
            while(a[down]<=pi && down<up)
            down++;
            while(a[up]>pi)
            up--;
            if(down<up)
            {
                temp=a[down];
                a[down]=a[up];
                a[up]=temp;
            }
        }
        a[lb]=a[up];
        a[up]=pi;
        return up;
    }
    void qsort(int a[],int lb, int ub)
    {
        if(lb<ub)
        {
            int j=partition(a,lb,ub);
            qsort(a,lb,j-1);
            qsort(a,j+1,ub);
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        System.out.println(a[i]+" ");
    }
}
class QuickSort
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int x=sc.nextInt();
    QS q=new QS(x);
    q.generate();
    long st=System.currentTimeMillis();
    q.qsort(q.a,0,q.n-1);
    long et=System.currentTimeMillis();
    System.out.println("Sorted array:");
    q.display();
    System.out.println("Total time="+(et-st));
}
}
