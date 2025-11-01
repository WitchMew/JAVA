// Take a input from user and Replace the Vowels with '*'.
import java.util.Scanner;
class ReplaceVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String newStr = "";
        for(int i=0; i<str.length() ; i++) 
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                newStr = newStr + '*';
            }
            else
            {
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }
}