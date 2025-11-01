import java.util.*;
public class Array2d{
public static void main(String[] args)
{
int arr[][] = new int[3][3];
Scanner sc = new Scanner(System.in);
System.out.println("Enter 9 elements : ");
for(int i=0; i<3; i++){
    for(int j=0; j<3; j++)
    {
        arr[i][j] = sc.nextInt();
    }
}
System.out.println("The 2D array is : ");
for(int i=0; i<3; i++){
    for(int j=0; j<3; j++)
    {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

}
}