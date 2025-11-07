import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenizeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        StringTokenizer str = new StringTokenizer(st);
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
            System.out.println(str.countTokens());
        }
     }
    }

