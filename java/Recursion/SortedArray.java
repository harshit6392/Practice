package Recursion;
//chech weather the given array is sorted or not using recursion
public class SortedArray {
    public static boolean isSorted(int arr[], int i){
        //base case
        if(i==arr.length-1)
        return true;
        if (arr[i]>arr[i+1]){
            return false;
        }
        //recursive call
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
