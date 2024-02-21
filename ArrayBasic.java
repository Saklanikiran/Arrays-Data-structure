package Arrays;
import java.util.Scanner;

public class ArrayBasic {

    void twoDimensionlIn(int[][] arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for 2*3 matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void twoDimensionlOut(int[][] arr)
    {
        System.out.println("Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
                System.out.println();

        }
        
    }
    public static void main(String[] args) {
        
        // 1-dimensional array
        int[] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 element");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        System.out.print("Array is : ");
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("length : "+arr.length);

        // 2-dimensional array

        int[][] arr1=new int[2][3];
        ArrayBasic a=new ArrayBasic();
        a.twoDimensionlIn(arr1);
        
        a.twoDimensionlOut(arr1);
    }
    
}
