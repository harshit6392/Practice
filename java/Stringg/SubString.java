package Stringg;

// In java there is already a function which returns the value of the substring 
// as given in the below program.

public class SubString {
    public static void getSubString(String str, int x ,int y){
        for(int i=x;i<y;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str ="HelloWorld";
        int x=0,y=5;
        getSubString(str, x, y);
        System.out.println(str.substring(0,5));
    }
}
