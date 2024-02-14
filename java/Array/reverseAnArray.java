package Array;

//two methods both having O(n) time complexity but 
//for loop method takes O(n) space complexity and 
//swap method takes only O(1) space complexity, coz we're not going to use extra array to reverse it.

public class reverseAnArray {

    public void reverse(int arr[]){
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseAnArray obj = new reverseAnArray();
        obj.reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }               
    }
}
