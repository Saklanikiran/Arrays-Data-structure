package Arrays;
import java.util.*;

public class TargetSum
{
    public static int targetSum(int[] arr,int target)
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target) count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,6,3,5,8,2};
        System.out.println("Enter target sum");
        int target=sc.nextInt();
        int n=targetSum(arr, target);
        System.out.println("number of pairse are in this array is : "+n);

    }
}