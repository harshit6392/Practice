package Array;

public class Largest {

    public static int getLargest(int arr[]) {
        int Largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }
        return Largest;
    }

   public static int getSmallest(int arr[]) {
        int Smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
        }
        return Smallest;
    }

    public static void main(String[] args) {
        int[] arr = {  4, 4, 4, 3, 2, 1, 1 };
        System.out.println(getLargest(arr));
        System.out.println(getSmallest(arr));
        
    }
    
}
