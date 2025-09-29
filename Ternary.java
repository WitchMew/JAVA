import java.util.*;
class Ternary{
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            String st = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
            System.out.println(st);
        }
    }
}