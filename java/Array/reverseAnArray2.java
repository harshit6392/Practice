package Array;

public class reverseAnArray2 {

    public void reverse(int arr[],int length){
        System.out.println("reversed array");
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        //original array
        System.out.println("original array");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        reverseAnArray2 obj=new reverseAnArray2();
        obj.reverse(arr, length);
        
    }
}
