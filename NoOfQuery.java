package Arrays;
import java.util.*;


/*
    Algorithm:
    1.make a frequency array of lengrh 10^5 because it is given in question that the query is less than 10^5
    2.the whole array is initially 0 we assign the no of frequecy in that indexes where the element present in array
    3.enter query and check in the index of frequecy array

 */
public class NoOfQuery {

    public static int[] makeFreqArr(int[] arr)
    {
        int[] freq=new int[100002];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]=freq[arr[i]]+1;
        }

        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] freq=makeFreqArr(arr);
        System.out.println("how many query do you have");
        int q=sc.nextInt();
        while(q>0)
        {
            System.out.println("enter query no : ");
            int e=sc.nextInt();
            if(freq[e]>0) System.out.println("YES");
            else System.out.println("NO");
            q--;
        }
    }
    
}
