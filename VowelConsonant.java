//Take a input front user and find out how many vowels and consonents are there.
import java.util.Scanner;
class VowelConsonant {
    public static void main(String[] args){
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.nextLine();
    str.toLowerCase();
    int vowelCount = 0 , consonentsCount = 0;
    for (int i=0 ; i<str.length() ; i++)
    {
        char ch = str.charAt(i);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            vowelCount++;
        else if(ch>='a' && ch<='z')
            consonentsCount++;
    }
    System.out.println("Number of Vowels : "+vowelCount);
    System.out.println("Number of Consonents : "+consonentsCount);
        
}
}
