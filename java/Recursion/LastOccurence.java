package Recursion;

//program to check the last ocurrence of the element in an array using recursion.

public class LastOccurence {
        public static int lastcheck(int arr[], int key, int i){
            if(i==arr.length){
                return -1;
            }
            int isFound = lastcheck(arr, key, i+1);
            if(isFound==-1 && arr[i]==key){
                return i;
            }
            return isFound;
        }
        public static void main(String[] args) {
            int arr[]={5,5,5,55};
            System.out.println(lastcheck(arr, 5, 0));
        }
}
