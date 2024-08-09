import java.util.Scanner;
class Insertion_Sort
{
    void sort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=key;
        }
    }
   void printarray(int arr[])
    {
        int n=arr.length;
        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++)
        System.out.println(arr[i]+" ");
        System.out.println();
    }
}
public class InsertionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Insertion_Sort ob=new Insertion_Sort();
        long st=System.currentTimeMillis();
        ob.sort(arr);
        long et=System.currentTimeMillis();
        System.out.println("Sorted array:");
        ob.printarray(arr);
        System.out.println("Total time="+(et-st));

    }
}
