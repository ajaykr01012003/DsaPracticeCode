public class Prime {
    public static boolean primeNo(int n){
        if(n==2){
             System.out.println("prime");
            return true;

        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not prime");
                return false;
            }

        }
         System.out.println("prime");
        return true;
    }
    public static void PrimeinRange(int low, int high){
        for(int i=low; i<=high;i++){
            if(primeNo(i)){
                System.err.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
         primeNo(10);
        //PrimeinRange(2, 20);
    }
}
