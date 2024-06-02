package Test;


public class Test{
    public static void prefix(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix []=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }        
        // calculate ms
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cs=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(ms<cs){
                    ms=cs;        
            }
        }

        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        prefix(arr);
    }
}