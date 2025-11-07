import java.util.*;
public class ReverseSentence {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String st = sc.nextLine();
    StringTokenizer str = new StringTokenizer(st);
    String rev = "";
    while (str.hasMoreTokens()) {
        String word = str.nextToken();
        rev = word + " " + rev;
    }
    System.out.println("Reversed Sentence:");
    System.out.println(rev.trim()); 
 }
}