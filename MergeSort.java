import java.util.Scanner;
import java.util.Random;
class MS
{
    int n, a[];
    MS(int x)
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
            a[i]=r.nextInt(20);
            System.out.println(a[i]+" ");
        }
    }
    void Merge(int low,int mid, int high)
    {
        int h,i,j,k;
        h=low; i=low;j=mid+1;
        int b[]=new int[n];
        while(h<=mid && j<=high)
        {
            if(a[h]<+a[j])
            {
                b[i]=a[h];
                h=h+1;
            }
            else
            {
                b[i]=a[j];
                j=j+1;
            }
            i=i+1;
        }
        if(h>mid)
        {
            for(k=j;k<=high;k++)
            {
                b[i]=a[k];
                i=i+1;
            }
        }
        else{
            for(k=h;k<=mid;k++)
            {
                b[i]=a[k];
                i=i+1;
            }
        }
        for(k=low;k<=high;k++)
        a[k]=b[k];
    }
    void msort(int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            msort(low,mid);
            msort(mid+1,high);
            Merge(low,mid,high);
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        System.out.println(a[i]+" ");
    }
}
class MergeSort
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int x=sc.nextInt();
    MS m=new MS(x);
    m.generate();
    long st=System.currentTimeMillis();
    m.msort(0,m.n-1);
    long et=System.currentTimeMillis();
    System.out.println("Sorted array:");
    m.display();
    System.out.println("Total time="+(et-st));
}
}
