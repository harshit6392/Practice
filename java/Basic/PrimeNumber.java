package Basic;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to check as a prime number");
        boolean isPrime=true;
        
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            
            if (num==0 || num ==1) {
                System.out.println("0 and 1 are not considered as a prime number");
            }
            
            else{
                for(int i=3;i<num;i++){
                    if(num%i==0){
                        isPrime=false;
                    }
                }
            
            if(isPrime==true) {System.out.println(num+ " is a Prime number");}
            else System.out.println(num + " is not a prime number");
            }
        }       
    }
}
