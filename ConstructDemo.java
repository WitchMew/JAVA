public class ConstructDemo {
int a,b,c;
String name;
ConstructDemo()
{
    a=10; b=50; c=30;
    name="Hello Peoples";
    System.out.println("Hello I'm Constructor");
}
void sum()
{
    System.out.println("The Sum is :"+(a+b+c));
}
void show()
{
    System.out.println(name);
}
public static void main(String[] args)
{
    ConstructDemo obj=new ConstructDemo();
    obj.sum();
    obj.show();
}
}
