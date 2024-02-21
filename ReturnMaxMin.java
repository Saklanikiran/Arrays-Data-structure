package Arrays;
import java.util.*;

// program for returning array of maximum and minimum element of the given array

public class ReturnMaxMin {

    // method for returning max and min element of given array
    public static int[] returnMaxMin(int[] arr)
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        int[] r={max,min};
        return r;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" values");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        CopyArr obj=new CopyArr(); // object of another class copyarr
        obj.printArray(arr); // method of class copyArr
      int[] ar=new int[2];
      ar=returnMaxMin(arr);
        System.out.println("Maximum is "+ar[0]);
        System.out.println("Minimum is "+ar[1]);


    }
}
