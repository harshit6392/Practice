package Basic;

public class Tables {
    
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
                System.out.print(j+" * "+i+" = "+ (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
