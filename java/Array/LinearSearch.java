package Array;
// Linear Search in Java
public class LinearSearch{
    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length ; i++){
            if(num[i]==key){
                return i;
            }
        }

        return -1;

    }
    public static void main (String[]args){
        int arr[]={1,2,3,4,5,6,7,8};
        int key=10;
        int index = linearSearch(arr,key);
        if(index==-1)
        {System.out.println("Not Found");}
        else 
        System.out.println("The key is at "+ index);
    }
}