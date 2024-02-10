import java.util.Scanner;

public class AnyBaseToDeci {
  
              public static int friquDidit(int n, int b){
      int convertedNo=0;
      int p=1;
       while (n > 0) {
          int dig=n%10;
           n=n/10;
          convertedNo += dig * p;
        p=p*b;
       }
        return convertedNo;
    }
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
          int b=sc.nextInt();
        
         int fun=friquDidit(n,b);
         System.out.println(fun);
    }
   
    }

