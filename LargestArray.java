import java.util.*;
class LargestArray{
public static void main(String[] args)
{
int arr[][] = new int[3][3];
int max=0;
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
for(int i=0; i<3; i++){
    for(int j=0; j<3; j++)
{
    if (arr[i][j]>max)
    {
        max = arr[i][j];
    }
  System.out.println("The Largest array is :  "+max);
}
}
}
}
