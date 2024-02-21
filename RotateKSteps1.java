package Arrays;
import java.util.*;

public class RotateKSteps1 {

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

    public static void reverseArr(int[] arr,int i,int j)
    {
      
        while(i<j)
        {
            swap(arr,i++,j--);
        }
       
    }

    public static void rotatekSteps(int[] arr,int k)
    {
       
        int n=arr.length;
        k=k%n;
        reverseArr(arr,0, n-k-1);
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n-1);
        printArray(arr);
        
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("how many times do you want to rotate the array");
        int k=sc.nextInt();
        rotatekSteps(arr,k);
        

    }
    
}
