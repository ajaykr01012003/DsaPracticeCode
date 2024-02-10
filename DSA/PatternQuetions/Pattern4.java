import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n,sp=0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=sp; j++) {
                System.err.print("\t");
            }
            for (int j=1; j<=st; j++) {
                System.err.print("*\t");
        }
        st--;
        sp++;
        System.err.println();
        }
 }
}
