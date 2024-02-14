package Array;
/*Printing the maximum of sub-array using PREFIX ARRAY METHOD
 to reduce the time complexity form O(n^3) to O(n^2)*/
public class MaxSubArrayII {
    public static void subarraySum(int []arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        //creating the prefix array.
        for(int i=1;i<arr.length;i++){
            // sum of previous elements + current element
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum =i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.print(currSum+" ");
            }
            System.out.println();
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.println("MaxSum "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        subarraySum(arr);
    }
    
}
