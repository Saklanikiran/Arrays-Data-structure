package Arrays;
import java.util.*;

// by using some extra space

public class RotateKSteps {

    public static void printArray(int[]  arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int[] rotatekSteps(int[] arr,int k)
    {
        int[] ans=new int[arr.length];
        k=k%arr.length;
        int j=0;
        int n=arr.length;
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("how many times do you want to rotate the array");
        int k=sc.nextInt();
        int[] ans=rotatekSteps(arr,k);
        printArray(ans);

    }
    
}
