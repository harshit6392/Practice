package Array;

//Printing the subArrays in an array.

public class SubArrays {
    public static void printSubArrays(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+"");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+total);
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        printSubArrays(arr);
        
    }
    
}
