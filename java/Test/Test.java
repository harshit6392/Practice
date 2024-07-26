package Test;

public class Test{
    public static void check(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    for(int k=i;k<n;k++){
                        for(int l=j;l<n;l++){
                            arr[k][l]=0;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,1},{1,1,1},{1,1,1}};
        check(arr);
    }
}