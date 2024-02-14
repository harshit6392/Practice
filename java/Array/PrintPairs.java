package Array;

// printing the pairs total number of arrays in an array
public class PrintPairs {
    public static void print(int arr[]){
        int totalPairs=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print(i+""+j+" ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs "+totalPairs);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        print(arr);
    }
}