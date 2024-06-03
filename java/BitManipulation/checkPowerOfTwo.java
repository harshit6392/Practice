package BitManipulation;

public class checkPowerOfTwo {
    // check whether the number is the power of two or not 
    // 4 = 2^2
    // 8 = 2^3
    // 16 = 2^4
    // evertime when we & the number with number-1 we get 0(zero) if the number is power of 2.
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0 ;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
