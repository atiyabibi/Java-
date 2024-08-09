import java.util.Scanner;
class S
{
    void sort(int arr[])
    {
        int n=arr.length;
        System.out.println(n);
        for(int i=0;i<n-1;i++)
        {
            int m=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[m])
                {
                    m=j;
                }
            }
                int temp=arr[m];
                arr[m]=arr[i];
                arr[i]=temp;
        }
    }
    void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        S sobj= new S();
        long st=System.currentTimeMillis();
        sobj.sort(arr);
        long et=System.currentTimeMillis();
        System.out.println("Sorted array:");
        sobj.printArray(arr);
        System.out.println("Total time="+(et-st));
    }
}
