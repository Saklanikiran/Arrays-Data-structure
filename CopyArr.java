package Arrays;
public class CopyArr {

    // method for print given array
    void printArray(int[] arr)
    {
        System.out.print("Array is : ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // method for number of occurrences of given number in the given arrray
    public int occurance(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                count++;
        }
        return count;
    }

    //method for given array is sorted or not

    public boolean isSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int a=arr[i-1];
            if(arr[i]<a) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,5,5,7,9};
        CopyArr c=new CopyArr();
        c.printArray(arr);
        System.out.println();
        int a=c.occurance(arr, 5);
        System.out.println("Occurrence of 5 in this given array is "+ a);
        System.out.println(c.isSorted(arr));

    
    }
    
}
