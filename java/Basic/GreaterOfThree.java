package Basic;
import java.util.*;



public class GreaterOfThree {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            double a=sc.nextDouble();
            System.out.println("Enter the second number: ");
            double b=sc.nextDouble();
            System.out.println("Enter the third number: ");
            double c=sc.nextDouble();
            if(a>b&&a>c){
                System.out.println("The first number is greater than the other two.");
            }
            else if(b>a&&b>c){
                System.out.println("The second number is greater than the other two.");
            }
            else if(c>a&&c>b){
                System.out.println("The third number is greater than the other two.");
            }
            else{
                System.out.println("The numbers are equal.");
            }
        }
    }
    
}
