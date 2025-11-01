import java.util.Scanner;

class TestString 
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a String : ");
   String str = sc.next();
   int Ic=0,dc=0,scc=0;
   for (int i = 0 ; i < str.length() ; i++)
   {
    char ch=str.charAt(i);
    if(Character.isLetter(ch))
    
        Ic++;

    else if(Character.isDigit(ch))
    
        dc++;
    
    else
    
        scc++;
    
    System.out.println("Number of Letter is : "+Ic);
    System.out.println("Number of Digit is : "+dc);
    System.out.println("Number of Special Character is : "+scc);
   }
//    System.out.println(str.substring(2));
 }    
}