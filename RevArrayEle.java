import java.util.*;
class ReverseNo
{
    int arr[]=new int[5];
    int Reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
        void accept() 
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter 5 numbers");
       for (int i = 0; i < 5; i++) 
       arr[i]=sc.nextInt();
       System.out.println("Original array");
       for (int i = 0; i < 5; i++) 
       System.out.println(arr[i]);
       for(int i=0;i<5;i++)
       {
        arr[i]=Reverse(arr[i]);
       }       
       System.out.println("New array");
       for (int i = 0; i < 5; i++) 
       {
        System.out.println(arr[i]);
       }
    }
    public static void main(String[] args) {
        ReverseNo obj=new ReverseNo();
        obj.accept();
    }
}