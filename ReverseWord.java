//Take a input from user and Reverse tha word and check it is palindrome no. or not. 
import java.util.Scanner;
class ReverseWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String revStr = "";
        for(int i=str.length()-1 ; i>=0 ; i--) 
        {
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr))
           System.out.println(revStr);
        else
          System.out.println(revStr);
    }
}
