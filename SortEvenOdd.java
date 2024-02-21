package Arrays;
public class SortEvenOdd {

    public static void printArray(int[] arr)
    {
        System.out.print("Array is : ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void sortEvenOdd(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]%2==0 && arr[j]%2!=0)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2!=0) i++;
            if(arr[j]%2==0) j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        sortEvenOdd(arr);
        printArray(arr);
    }
    
}
