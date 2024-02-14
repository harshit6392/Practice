package Inheritance;

class Recangle{
    public void area(int l,int b){
        System.out.println("Area of Rectangle is: "+(l*b));
        
    }
}
class Circle extends Recangle{
    public void area(double r){
        System.out.println("Area of Circle is: "+(3.14*r*r));
    }
}
class Square extends Circle{
    public void area(int s){
        System.out.println("Area of Square is: "+(s*s));
    }
}
public class ShapeArea extends Square{
    public static void main(String[] args) {
        ShapeArea obj=new ShapeArea();
        obj.area(5);
        obj.area(5, 6);
        obj.area(6.5);
    }
}
