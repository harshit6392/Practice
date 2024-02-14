package Basic;

public class EvenOdd {
    
    public static int evenOdd(int n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        
        int n = 10;
        int result = evenOdd(n);
        if (result == 1) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
    }

}
