package Arrays;
import java.util.*;


public class SortZeroOne1
{
    
    public static void printArray(int[]  arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void sortZeroOne(int[] arr)
    {
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(left==0)
                left++;
            if(right==1) 
                right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 element");
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();
        System.out.println("Before sorting");
        printArray(arr);
        sortZeroOne(arr);
        System.out.println("After sorting");
        printArray(arr);
    }
}