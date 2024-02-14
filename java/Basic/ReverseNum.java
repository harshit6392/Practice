package Basic;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse:");
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int rev = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num /= 10; // update the value of num by removing the last digit
            }
            System.out.println("The reverse is " + rev);
        }
    }
}
