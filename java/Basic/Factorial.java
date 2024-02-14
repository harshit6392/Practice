package Basic;
import java.util.Scanner;

class Fact{
    public long factorial(int num){

        long fact=1;
        if(num==1){
            return 1;
        }
        else{

            for(int i =1;i<=num;i++){
                fact *=i;
            }
            

        }
        return fact;

    }
}


public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you want to calculate the factorial:");

        try(Scanner sc = new Scanner(System.in);){
        
            int num = sc.nextInt();


           Fact f=new Fact();
           long fact =f.factorial(num);

           System.out.println("Factorial of "+num+ " is "+fact);

           
        }

    }
}
