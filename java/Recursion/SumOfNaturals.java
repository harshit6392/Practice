package Recursion;

public class SumOfNaturals {

    public static int sumNautral(int n){

        if (n==1){
            return 1;
        }
        int sum= n+sumNautral(n-1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNautral(10));
    }
}
