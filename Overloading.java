// Function Overloading in java 
public class Overloading {     
void sum(){
    System.out.println("Hello I'm Sum method");
}
void sum(int a,int b){
    System.out.println("The sum is :"+(a+b));
}
public static void main(String[]args)
{
    Overloading obj=new Overloading();
    obj.sum();
    obj.sum(20,54);
}
}

