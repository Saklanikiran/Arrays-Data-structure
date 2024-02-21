package Arrays;

//program for prefix sum based on the given range

import java.util.Scanner;

public class PrefixSum {
    public static void printArray(int[] arr)
    {
        System.out.print("Array is : ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i>0)
            {
                arr[i]=arr[i]+arr[i-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,1,3,4,5,};
        System.out.println("how many queries do you have");
        int q=sc.nextInt();
        int pref[]=prefixSum(arr);
        while(q-- >0)
        {
            System.out.println("enter range of prefix sum");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=pref[r]-pref[l-1];
            System.out.println("sum is : "+sum);
        }

    }
    
}
