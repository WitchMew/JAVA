// Take input from user and convert the word to piglatin format. from where the vowel starts. 
import java.util.Scanner;
public class PiglatinWord {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String str = sc.nextLine();
      String piglatin = "";
      for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                 ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                piglatin = str.substring(i) + str.substring(0,i) + "ay";
                break;
            }
        }
        System.out.println("Piglatin format: " + piglatin);
    }
}
