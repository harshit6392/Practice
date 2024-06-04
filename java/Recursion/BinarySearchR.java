package Recursion;

public class BinarySearchR {
    public static int search(int arr[], int target, int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start + (end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, 0, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,78};
        System.out.println(search(arr, 1 , 0  , arr.length-1));
    }
}
