import java.util.Scanner;

public class ReverseDig {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
    while (n!=0) {
        int b=n%10;
        System.out.println(b);
        n=n/10;
    }
  }
}
