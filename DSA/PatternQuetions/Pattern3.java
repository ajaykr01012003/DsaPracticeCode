import java.util.Scanner;

public class Pattern3 {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n-1,st=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=sp; j++) {
                System.err.print("\t");
             }
               for(int j=1; j<=st; j++) {
                System.err.print("*\t");
             }
             sp--;
             st = st+1;
             System.err.println();
     }
}
}
