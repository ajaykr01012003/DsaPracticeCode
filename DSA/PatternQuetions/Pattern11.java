public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.err.print(j+"  ");
            }
            System.out.println();
        }
        int val=1;
         for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.err.print(val+"  ");
                val++;
            }
            System.out.println();
        }
    }
}
