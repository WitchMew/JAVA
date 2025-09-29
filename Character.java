import java.util.*;
class Character {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch=sc.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
         System.out.println(ch+" Is an Alphabet");
        else if(ch>='0'&& ch<='9')
         System.out.println(ch+" Is a Digit");
        else 
         System.out.println(ch+" Is a Special Character");
    }
}
