//Take a input front user and find out how many vowels and consonents are there.
import java.util.Scanner;
class Vc {
    public static void main(String[] args){
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine().toUpperCase();
    
    String vowelCount = "" , consonentsCount = "";
    for (int i=0 ; i<str.length() ; i++)
    {
        char ch = str.charAt(i);
        if("AEIOUaeiou".indexOf(ch)>=0)
            vowelCount=vowelCount+ch;
        else
            consonentsCount=consonentsCount+ch;
    }
    System.out.println(" Vowels : "+vowelCount);
    System.out.println(" Consonents : "+consonentsCount);
        
}
}
