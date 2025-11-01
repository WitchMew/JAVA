import java.util.Scanner;

/*print star between characters */
public class StarWord 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++)
        {
            result.append(word.charAt(i));
            if (i!= word.length() - 1)
            {
                result.append('*');
            }
        }
        System.out.println("Result: " + result.toString());
    }
}