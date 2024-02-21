package Arrays;

// reverse array without using an extra space
public class ReverseArray2 {

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
       printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseArr(arr);
        
    }
    
}
