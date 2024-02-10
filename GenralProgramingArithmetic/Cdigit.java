import java.util.Scanner;

// public class Cdigit {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int dig=0;
//         while(n!=0){
//             n=n/10;
//             dig++;
//         }
//         System.out.print(dig);
//     }
// }
public class Cdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dig=0,temp=n;

        while(temp!=0){
            temp=temp/10;
            dig++;
        } 
        int div=(int)Math.pow(10, dig-1);
        while (div!=0) {
        int q=n/div;
        System.out.println(q);
        n=n%div;
        div=div/10;
        }
    }
}
