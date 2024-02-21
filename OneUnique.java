package Arrays;

public class OneUnique {

    public static int unique(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) count++;
            }
            if(count==0) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,1,3};
        System.out.println("The unique element of given array is : "+unique(arr));
    }
    
}
