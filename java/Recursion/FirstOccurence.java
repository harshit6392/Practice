package Recursion;

//finding the first occurence of a number in the array using recursion
public class FirstOccurence {
    public static int searchOccurence(int arr[], int key, int i){
        if(i==arr.length)
        return -1;
        // Base Case
        if(arr[i]==key)
        return i;
        // recursive call
        return searchOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={5,3,13,67,7,54};
        System.out.println(searchOccurence(arr, 2, 0));
    }
}
