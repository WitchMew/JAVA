import java.util.Scanner;
class SpecialNo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            int real = num;
            int sum = 0;
            while (num > 0) 
            {
                int temp = num % 10;
                int fact = 1;
                for (int i = 1; i <= temp; i++) 
                {
                    fact *= i;
                }
                sum += fact;
                num /= 10;
            }
            if (sum == real) 
            {
                System.out.println(real + " is a Special number.");
            } 
            else 
            {
                System.out.println(real + " is NOT a Special number.");
            }
            System.out.println("Do you want to continue? press 1 for yes, 0 for no");
            choice = sc.nextInt();
        } 
        while (choice == 1);
        sc.close();
    }
}