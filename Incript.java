// take intpur from user and incript and dectript the string. Example : Input = "MANGO" output = "OCIPQ".
// Example : Input = "Shreya" output = "UJTFBC". It should print letters again after Z like A,B,C.
// It should run According to ASCIIvalues only letter no other character.
import java.util.Scanner;
public class Incript {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String incriptedStr = "";
        for(int i=0; i<str.length() ; i++) 
        {
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                ch = (char)(ch + 2);
                if((ch>'Z' && ch<'a') || (ch>'z'))
                {
                    ch = (char)(ch - 26);
                }
            }
            incriptedStr = incriptedStr + ch;
        }
        System.out.println("Incripted String: " + incriptedStr);
    }
}
