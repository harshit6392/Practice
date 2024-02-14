package Basic;
import java.util.Scanner;
public class BinomialCofficient {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            int n =sc.nextInt();
            System.out.println("Enter the value of r");
            int r=sc.nextInt();
            if (n<r) {
                System.out.println("the value of 'r' can not ne greater than 'n' ");
                
            } else {        
            Fact obj=new Fact();
            long num = obj.factorial(n);
            long rr =obj.factorial(r);
            long nr =obj.factorial(n-r);
            long result= num/(rr*nr);
            System.out.println("The Binomial Cofficient of given values are "+result);

            }
        }
        
        
    }
}
