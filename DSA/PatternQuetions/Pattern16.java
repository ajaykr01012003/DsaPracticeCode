public class Pattern16 {
    public static void main(String[] args) {
        int n=4;
        int st=1,sp=2 * n -3;
         for(int i=1;i<=n; i++){
          int val=1;
            for(int j=1;j<=st;j++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j=1; j<=sp; j++){
                System.err.print("\t");
            }
            if(i==n){
                st--;
                val--;
            }
             for(int j=1; j<=st; j++){
                val--;
                System.err.print(val+"\t");
            }
            st++;
            sp-=2;
            System.out.println();
         }
    }
}
