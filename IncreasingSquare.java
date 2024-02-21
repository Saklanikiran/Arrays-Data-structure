package Arrays;

public class IncreasingSquare {

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

    public static void reverseArr(int[] arr)
    {
        int i=arr.length-1,j=0;
        while(i>j)
        {
            swap(arr,i--,j++);
        }
       
    }

    public static int[] incresingSquare(int[] arr)
    {
        int n=arr.length;
        int[] ans=new int[n];
        int left=0;
        int right=n-1;
        int k=0;
        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }


        return ans;

    }

    public static void main(String[] args) {
        int[] arr={-10,-5,-3,1,3,7,};
        int[] ans=incresingSquare(arr);
        reverseArr(ans);
        printArray(ans);

    }
    
}
