package Polymorphism;

class Animals{
    public void sound(){
        System.out.println("Animal");
    }
}

class Dog extends Animals {
    public void sound(){
        System.out.println("Dog");
    }

}
public class PolyAnimal {
    public static void main(String[] args) {
        
        Animals obj = new Dog();
        obj.sound();
    }
}
