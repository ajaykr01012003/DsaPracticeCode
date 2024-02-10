import java.util.Scanner;

public class CountFrequencyDigit {
    public static int friquDidit(int n, int d){
      int count=0;
       while (n > 0) {
          int rem=n%10;
        n=n/10;
        if(rem==d){
            count++;
        }
       }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int d=sc.nextInt();
         int fun=friquDidit(n,d);
         System.out.println(fun);
    }
  
}
