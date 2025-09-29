/* WAP to accept two numbers P and Q and print all the prime numbers only between them */
import java.util.*;
class Ques 
{
    public static void main(String[]ar)
    {
     Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number");
            int P =sc.nextInt();
            System.out.print("Enter second number: ");
            int Q = sc.nextInt();
            for (int i = P; i <= Q ; i++) 
            {
            int c = 0;
            for (int j = 2;j < i ; j++) 
                {
                    if(i%j==0)
                    c++;
                }
                    if (c == 0)
                    System.out.print(i);
                    
    }
    sc.close();
}
}