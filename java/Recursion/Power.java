package Recursion;

public class Power {
    // for this function the time complexity is O(n).
    public static int aPowern(int a,int n){
        //base case
        if(n==0){
            return 1;
        }
        return a* aPowern(a, n-1);
    }
    
    //Now, this function is an optimized approach with time complexity of O(logN)
    public static int aPowernOptimized(int a,int n){
        // base case
        if(n==0){
            return 1;
        }
        int op=aPowernOptimized(a, n/2);
        int halfpowerSq=op*op;
        //n is odd
        if(n%2!=0){
            halfpowerSq= a*halfpowerSq;
        }
        return halfpowerSq;
    }

    public static void main(String[] args) {
        System.out.println(aPowernOptimized(2, 9));
    }
}
