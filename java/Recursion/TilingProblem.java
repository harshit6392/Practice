package Recursion;

public class TilingProblem {
    public static int tilingPro(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }
        return tilingPro(n-1)+tilingPro(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingPro(5));
    }
}
