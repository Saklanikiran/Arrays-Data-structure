package Arrays;
import java.util.*;

public class SecondMaximum {

    public static int findMax(int[] arr)//method for finding largest value from the array
    {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>mx)
                mx=arr[i];
        }
        return mx;
    }
    public static int secondMax(int[] arr)
    {
        int m=findMax(arr);// 1.find the largest value from array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==m)
                arr[i]=Integer.MIN_VALUE;// where where the value is max make it min value
        }
        m=findMax(arr);// now find the largest value which is second maximum
        return m;
    }
    public static void main(String[] args) {
        int[] arr={-3,0,-7,-2,0,-4,-8,0};
        System.out.println("Second max value is : "+secondMax(arr));


    }
    
}
