/*Write a Menu driven program to accept the choice from the user and do the Following:
1-  Accept a number and check if it is divisible by 2,3,5 or not.
2- Accept three numbers and display the greatest among them.Display an appropriate message in case of wrong input.
*/
import java.util.*;
class Menu {
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
            System.out.println("\nMenu:");
            System.out.println("1. Check divisibility by 2, 3, or 5");
            System.out.println("2. Find the greatest of three numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter a number:");
                    int num=sc.nextInt();
                    if(num%2==0 || num%3==0 || num%5==0){
                        System.out.println(num+" is divisible by 2,3 and 5");
                    }
                    else{
                        System.out.println(num+ " is not divisible by 2,3 and 5");
                    }
                    break;
                case 2:
                    System.out.println("Enter three numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    if(a==b || b==c || a==c){
                        System.out.println("Wrong input");
                    }
                    else if(a>b && a>c){
                        System.out.println(a+" is the greatest number");
                    }
                    else if(b>a && b>c){
                        System.out.println(b+" is the greatest number");
                    }
                    else{
                        System.out.println(c+" is the greatest number");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    break;
                    default:
            }
            
        } 
    }

