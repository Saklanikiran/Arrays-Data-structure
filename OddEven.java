package Arrays;
import java.util.*;

public class OddEven
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<6;i++)
			arr[i]=sc.nextInt();
		int[] arr1=reverseOddEven(arr);
		printArray(arr1);
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
	public static int[] reverseOddEven(int[] arr)
	{
		int j=0;
		int[] temp=new int[arr.length];
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				temp[j]=arr[i];
				j++;
			}
		}
			
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				temp[j]=arr[i];
				j++;
			}
		}
		return temp;
						
	}		
}