package Recursion;

public class TillingProblem {
    public static int tillingProblem(int n){
        if (n==0 || n==1) {
            return 1;
        }
       
        //vetical
        int fnm1=tillingProblem(n-1);

         //Horizontal
         int fnm2=tillingProblem(n-2);

         int totalWays=fnm1+fnm2;
         return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
    
}
