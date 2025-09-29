import java.util.*;
class Discount {
    public static void main(String[]args)
    {
        //double k=20;   
        //float p=20.5;  this will cause error cause java takes fractional value as double by default 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The purchase amount:");
        int amt=sc.nextInt();
        double dis;
       // double dis=(amt>=20000)?20.0/100*amt:(amt>=10000)?15.0/100*amt:10.0/100*amt;
       if (amt>=20000) 
        dis=20.0/100*amt;
       else if(amt>=10000)
        dis=15.0/100*amt;
       else
        dis=10.0/100*amt;
        System.out.println("Your discount is:"+dis);
        System.out.println("Your payable amount is:"+(amt-dis));
    }
}


