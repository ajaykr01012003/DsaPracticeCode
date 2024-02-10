public class AnyBaseAdition {
    public static int AditionOctal(int n1, int n2, int base){
           int c=0,p=1,rv=0;
           while (n1>0 || n2>0 || c>0) {
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/base;
            d=d%base;
             rv +=d*p;
            p=p*10;
           }
           return rv;
    }
    public static void main(String[] args) {
         int n1=236;
         int n2=754; 
         int base=8;
         int x=AditionOctal(n1, n2, base);
         System.out.println(x);
    }
}
