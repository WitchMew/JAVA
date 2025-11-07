class Bike{
    int price;
    String color;
 void brake(){
    price=50000;
    color="Red";
    System.out.println("(I'm Base class), Bike Brake");
 }
}
class Splendor extends Bike{
    void brake(){
        super.brake();                         // Calling parent class method
        System.out.println("Bike Price: "+price);
        System.out.println("Bike Color: "+color);
        System.out.println("(I'm Child class), Braking System");
    }
    public static void main(String[] kk){
        Splendor sp = new Splendor();
        sp.brake();
    }
}