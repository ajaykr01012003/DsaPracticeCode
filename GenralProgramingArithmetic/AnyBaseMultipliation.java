public class AnyBaseMultipliation {
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
 
 public static int getSingleProduct(int n1, int d2, int base){
    int c=0,p=1,rv=0;
    while (n1>0 || c>0) {
     int d1=n1%10;
   
     n1=n1/10;
    
     int d=d1 * d2+c;
     c=d/base;
     d=d%base;
      rv +=d*p;
     p=p*10;
    }
    return rv;
}
 public static int getProduct(int b, int n2, int n1){
      int p=1,rv=0;
    while(n2>0){
        int d2=n2%10;
        n2=n2/10;
        int sprod=getSingleProduct(b,n1,d2);
        rv=AditionOctal(b,rv,sprod*p);
        p= p*10;
    }
      return rv;
 }
    public static void main(String[] args) {
       int b=8;
       int n1=45;
       int n2=45;
       System.out.println(getProduct(b, n2, n1)); 
    }
}
