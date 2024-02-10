import java.util.Scanner;

public class AnyBAseToAnyBAse {
    public static int AnyBAseTAnyBAse(int n,int b1,int b){
            int dec=AnyBaseToDecimal(n, b1);
            int anibase=DecimalToAnyBAse(dec, b);
            return anibase;
    }
    public static int DecimalToAnyBAse(int n, int b){
        int convertedNo=0;
        int p=1;
         while (n > 0) {
            int dig=n%b;
             n=n/b;
            convertedNo += dig * p;
          p=p*10;
         }
          return convertedNo;
      }
      public static int AnyBaseToDecimal(int n, int b1){
        int convertedNo=0;
        int p=1;
         while (n > 0) {
            int dig=n%10;
             n=n/10;
            convertedNo += dig * p;
          p=p*b1;
         }
          return convertedNo;
      }
      
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          int b=sc.nextInt();
        int b1=sc.nextInt();
        System.err.println(AnyBAseTAnyBAse(n, b1, b1));
     }
}
