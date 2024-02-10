package Recursion;

public class Fibbonacii {

    public static int fibbonacci(int n){
        if (n==0 || n==1) {
            return n;
        }
    
        int fn=fibbonacci(n-1) + fibbonacci(n-2);
        
        return fn;

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(fibbonacci(n));        
    }
    
}
