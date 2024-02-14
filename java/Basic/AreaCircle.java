package Basic;
import java.util.*;
public class AreaCircle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("The area of a circle with radius " + radius + " is " + area);
        }
    }
}
