package Arrays;
import java.util.*;

public class FirstRepeatValue {

    public static int firstRepeat(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        System.out.println("enter elements of the array : ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        System.out.println("First repeated element if this array is : "+firstRepeat(arr));
        
    }
    
}
