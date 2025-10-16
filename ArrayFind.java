//Find the Smallest and largest element in an array
import java.util.*;

public class ArrayFind {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array :");
    int n = sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int small=arr[0];
    int large=arr[0];
    for(int i=1;i<n;i++)
    {
        if(arr[i]<small)
        small=arr[i];
        if(arr[i]>large)
        large=arr[i];
    }
}
}
