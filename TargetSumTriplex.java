package Arrays;
import java.util.*;

public class TargetSumTriplex {

    public static int targettriplexSum(int[] arr,int target)
    {
        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target) count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int[] arr={1,4,5,6,3};
    System.out.println("enter your target sum");
    int target=sc.nextInt();
    System.out.println("number of triplex pairse of target sum is "+targettriplexSum(arr,target));

    }
}
