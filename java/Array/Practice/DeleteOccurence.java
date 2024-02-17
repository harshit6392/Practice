package Array.Practice;

import java.util.Scanner;

// In this program we are going to delete the occrence of a number in a given array.
//suppose 2 comes 5 times in a array of size 10 then it will get deleted from the array.

public class DeleteOccurence {
    public static void remove(int arr[], int number){
        int size=arr.length;
        int occrence=0;
        //calculating the number of occurence of the number
        for(int i=0; i<size;i++){
            if(arr[i]==number)
            occrence++;
        }
        //creating a new array to copy the elements from the original array
        int copy[]=new int[size-occrence];
        int j=0;
        for(int i=0;i<size;i++){
            if(arr[i] != number){
                copy[j++]=arr[i];
            }
        }

        System.out.println("after removing " + number +": ");
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num = sc.nextInt();
        System.out.println("Enter the array");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number you want to delete");
        int number = sc.nextInt();
        remove(arr,number);

    }    
}
