package DivideAndConquer;

public class MergeSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //merge sort 
    public static void mergeSorting(int arr[], int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        //sorting the left part
        mergeSorting(arr, si, mid);
        //sorting the right part
        mergeSorting(arr, mid+1, ei);
        //now merge the right and left parts 
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //index for 1st sorted parts
        int j=mid+1; //index for 2nd sorted parts
        int k=0; //index for temp

        while( i<=mid && j<=ei ){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //leftover of first sorted parts
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //leftover of second sorted parts
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy the temp to original array
        for(k=0,i=si ; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[]={5,2,7,1,9};
        mergeSorting(arr, 0, arr.length-1);
        printArray(arr);
    }
}
