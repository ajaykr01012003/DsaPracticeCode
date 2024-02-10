public class Prime1 {

         
     public static Boolean primeNo(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        
        }
         return true;
     }
     public static void printNoInRange(int low, int high){
      for(; low<=high; low++ ){
                 if(primeNo(low)){
                 System.out.print(low+"  ");
          }
      }
     }

    public static void main(String[] args) {
        
        printNoInRange(2, 20);

    }
}
