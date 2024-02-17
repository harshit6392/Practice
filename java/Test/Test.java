package Test;


public class Test{
    public static void fun(int arr[]){
        int num=2;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==num) {
                arr[i]=arr[i+1];
            }
            System.out.println(i +" " + arr[i]);
        }

    }    
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        fun(arr);
    }
}