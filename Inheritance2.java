abstract class Animal{
    String teethtype;
    abstract void eat();
    // void eat(){
    //     String teethtype;
    //     System.out.println("(I'm Base class), Animal is Eating");
    // }
}
class Carnivores extends Animal{
void eat(){
    // super.eat();                       // Calling parent class method
    teethtype="Big and Sharp Teeth";
    System.out.println("(I'm Child class), Carnivores eat meat and have "+teethtype);
}
}
class Herbivores extends Animal{
void eat(){
 //   super.eat();                       // Calling parent class method
    teethtype="Flat Teeth";
    System.out.println("(I'm Child class), Herbivores eat plants and have "+teethtype);
}
}
class main{
    public static void main(String[] args)
    {
        Carnivores c = new Carnivores();
        c.eat(); 
}
}