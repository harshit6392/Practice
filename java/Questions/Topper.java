package Questions;

import java.util.Scanner;

import Array.Largest;

public class Topper {
    public static int counter(int max,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }

        }        
        return count;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numbers of the student in the class");
            int st= sc.nextInt();
            System.out.println("Enter the marks of the students");
            int arr[]=new int[st];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max = Largest.getLargest(arr);
            System.out.println("Maximum marks in the class "+max);
            int answer= counter(max, arr);
            System.out.println("the total number of toppers are "+answer);
            System.out.println("the total number of toppers removed from that class are "+(answer-1));
        }


    }

    
}
