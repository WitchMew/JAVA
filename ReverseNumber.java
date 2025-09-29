import java.util.Scanner;

public class ReverseNumber {
    static int reverse(int num)     // Function to reverse a number
    {
        int rev = 0;
        while (num != 0) 
        {
            int digit = num % 10;   // get last digit
            rev = rev * 10 + digit; // append digit to reversed number
            num = num / 10;         // remove last digit
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = reverse(n); // function call
        System.out.println("Reversed number: " + reversed);
    }
}