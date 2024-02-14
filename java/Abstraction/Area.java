package Abstraction;

abstract class Shape {
    protected int width;
    protected int height;
    
    public abstract void calculateArea();
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void calculateArea() {
        int area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Shape {
    public Square(int side) {
        this.width = side;
        this.height = side;
    }
    
    public void calculateArea() {
        int area = width * height;
        System.out.println("Area of Square: " + area);
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.calculateArea();
        
        Shape square = new Square(7);
        square.calculateArea();
        
        Shape circle = new Circle(5);
        circle.calculateArea();
    }
}
