package Recursion;
//fibonacci using recursion
public class FibonacciR {
    public static int fibo(int n){
        //base case
        if(n<2)
        return n;
        //recursive call
        return fibo(n-2)+fibo(n-1);
    }
 public static void main(String[] args) {
    System.out.println(fibo(5));
 }   
}