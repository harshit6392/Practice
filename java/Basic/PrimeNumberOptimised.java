package Basic;

import java.util.Scanner;

public class PrimeNumberOptimised {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number you want to check as a prime number");
            int num=sc.nextInt();

            boolean isPrime = true;

            if(num==0||num==1){
                System.out.println("0 and 1 are not consider as the prime number");
            }
            if(num==2)
                System.out.println("2 is the smallest prime number");
            else{
                for(int i=2;i<Math.sqrt(num);i++){
                    if (num%i==0) {
                        isPrime=false;
                    }
                }

                if(isPrime==true)
                System.out.println(num+" is a prime number");

                else{
                    System.out.println(num +" is not a prime number");
                }
            }

        }
    }
}
