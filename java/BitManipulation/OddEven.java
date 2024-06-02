package BitManipulation;

public class OddEven {
    public static void oddandeven(int num){
        int bitMask=1;
    if((num & bitMask)==0){
        //even
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }
    }
    public static void main(String[] args) {
        oddandeven(5);
        oddandeven(6);
    }
}
