package Arrays;

// program for reverse an array using an another array
public class ReverseArr1 {

    public static void printArray(int[]  arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static int[] reverseArr(int[] arr)
    {
        int[] ans=new int[arr.length];
        int i=arr.length-1,j=0;
        while(i>=0)
        {
            ans[j++]=arr[i--];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] ans=reverseArr(arr);
        printArray(ans);
    }
    
}
