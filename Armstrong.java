/*string p = n+;
 * int l =p.length();
 */
import java.util.*;
class armstrong 
{
    public static void main(String[]ar)
    {
     Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int num =sc.nextInt();
            int len = (num+"").length();
            int sum = 0;
            int temp = num;
            while(temp!=0)
            {
                int r = temp%10;
                sum=sum+(int)Math.pow(r, len);
                temp=temp/10;
            }
            if(sum==num)
            {
            System.out.println( "Armstrong number");
            }
            else{
                System.out.println( "not an Armstrong number");
            }
      sc.close();      
    }
}
