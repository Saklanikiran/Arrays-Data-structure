package Arrays;
public class MaxArr {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,2,5,7};
        
        // calculate maximum element from the 1D array
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        System.out.println("Maximum element is : "+ans);

        // find the first accurance of given element in array

        int idx=-1;
        //System.out.println("enter element for searching : ");
        int element=7;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                idx=i;
                break;
            }
        }
        System.out.println("element present in the index : "+idx);

    }
}
