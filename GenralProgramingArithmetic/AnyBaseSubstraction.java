public class AnyBaseSubstraction {
    public static int subtraction(int n1, int n2, int b){
        int c=0,p=1,rv=0;
        while (n2>0) {
         int d1=n1%10;
         int d2=n2%10;
         n1=n1/10;
         n2=n2/10;
         int d=0;
         d2=d2+c;
         if(d2>=d1){
            c=0;
            d=d2-d1;
         }else{
            c=-1;
            d=d2+b-d1;
         }
         rv=rv+d*p;
         p=p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        int b=8;
        int n1=256;
        int n2=1212;
        System.out.println(subtraction(n1,n2,b));
    }
}
