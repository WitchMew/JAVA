import java.util.*;
class PrimeNo 
{
    public static void main(String[]ar)
    {
     Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            int c = 0;
            for(int i=2; i<num ; i++)
            {
                if(num%i==0)
                c++;
            }
            if(c==0){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is a composite number");
            }
            sc.close();
    }
}