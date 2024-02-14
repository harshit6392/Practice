package Array;
import java.util.Scanner;
public class BinarySearch {

    public int search(int arr[], int key){

        int low=0 , high=arr.length-1;
        while(low<=high){
            int mid=(low + high)/2;
            if(key==arr[mid])
            return mid;
            else if(key>arr[mid]){
                low=mid+1;
            }
            else
            high=mid-1;
            }
        return -1;
        }
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number you want to search in the array.");
            int key= sc.nextInt();
            int a[]={1,2,3,4,5,6,7,8,9};
            BinarySearch obj=new BinarySearch();
            int ans= obj.search(a, key);
            if(ans==-1)
            System.out.println("Not found ");
            else
            System.out.println("Found");
        }

    }
}
