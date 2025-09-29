// import java.util.*;
// class LoopDemo {
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
// }
import java.util.*; 
class LoopDemo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The table of "+n+" is:");
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}