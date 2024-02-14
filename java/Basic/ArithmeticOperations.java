package Basic;

class Adder {
   public static int add(int a, int b) {
      return a + b;
   }
}
class Subtractor {
   public static int subtract(int a, int b) {
      return a - b;
   }
}
class Multiplier {
   public static int multiply(int a, int b) {
      return a * b;
   }
}
class Divider {
   public static int divide(int a, int b) {
      return a / b;
   }
}
class Modulus {
   public static int modulus(int a, int b) {
      return a % b;
   }
}


public class ArithmeticOperations{
   public static void main(String[] args) {
      int a = 10;
      int b = 5;
      System.out.println("a = " + a + ", b = " + b);
      System.out.println("a + b = " + Adder.add(a, b));
      System.out.println("a - b = " + Subtractor.subtract(a, b));
      System.out.println("a * b = " + Multiplier.multiply(a, b));
      System.out.println("a / b = " + Divider.divide(a, b));
      System.out.println("a % b = " + Modulus.modulus(a, b));
   }
}