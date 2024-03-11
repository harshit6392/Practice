package Stringg;
import java.util.Scanner;
public class PalindromeString {
    public static Boolean palindromeCheck(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        System.out.println(str.toUpperCase() + " is a palindrome");
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the String");
        try (Scanner sc = new Scanner(System.in)) {
            String str =sc.next();
            palindromeCheck(str);
        }
    }
}
