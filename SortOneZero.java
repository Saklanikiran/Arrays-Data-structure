package Arrays;

public class SortOneZero {

    public static void main(String[] args)
    {
        int[] arr={1,0,0,1,1,0,0,1,1,0,1};
        sortOneZero(arr);
        printArray(arr);
    }
    public static void printArray(int[]  arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void sortOneZero(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) count++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<count) arr[i]=0;
            else arr[i]=1;
        }
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
    
}
