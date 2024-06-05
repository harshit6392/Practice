package Basic;

public class checkZero {
    public static int checkXero(int n){
        int count=0;
        while(n>0){
            if(n%10==0){
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(checkXero(101010));
    }
}
