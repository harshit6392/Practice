package Recursion;

public class FirstOccurence {
    public static int searchOccurence(int arr[], int key, int i){
        if(i==arr.length)
        return -1;
        if(arr[i]==key)
        return i;
        return searchOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={5,3,13,67,7,54};
        System.out.println(searchOccurence(arr, 2, 0));
    }
}
