package Array.Sorting;

public class SelectionSort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[maxPos]>arr[j]) {
                    maxPos=j;
                }
            }
            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,7,2,1};
        selection(arr);
        printArr(arr);
    }
}
