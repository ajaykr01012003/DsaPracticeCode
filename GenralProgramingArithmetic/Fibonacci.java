import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,mult=0,a=0,b=1;
        System.out.println("your Fibbonacci Series : ");
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            int c=a+b;
            sum=sum+c;
            mult+=Math.pow(c, 2);
            System.out.println(c);
            a=b;
            b=c;
        }
        System.out.println("Sum of Fibonacci :"+sum);
        System.out.println("Multiplicaton :"+mult);
    }
}
