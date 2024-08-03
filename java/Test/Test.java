package Test;

public class Test{
    public static int checkPalindrome(int x){
        int rev=0;
        while (x>0) {
        int lastDigit = x%10;
        rev= rev*10+lastDigit;
        x=x/10;
        }    
        return rev;
    }
   public static void main(String[] args) {
   }
}