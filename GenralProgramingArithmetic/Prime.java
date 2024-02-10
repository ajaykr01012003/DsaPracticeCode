// import java.util.*;
// public class Prime{
//     public static void main(String [] args){
//          int n;
//          System.out.println("Enter the no. :");
//          Scanner sc=new Scanner(System.in);
//          n=sc.nextInt();
//          for(int i=0; i<n;i++){
//             int p=sc.nextInt();
//             int count=0;
//             for(int div=2; div*div<=p;div++){
//                 if(p%div==0){
//                     count++;
//                     break;
//                 }
//             }
//             if(count ==0){
//                 System.out.println("prime");
//             }
//             else{
//                 System.out.println("not prime");
//             }
//          }     
//     }
// }

import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  low=sc.nextInt();
        int high=sc.nextInt();
        for(int n=low;n<=high; n++){
            int count=0;
            for(int div=2; div*div<=n; div++){
                if(n%div==0)
                count++;
                break;
            }
             if(count==0){
              System.out.print(n+"  ");
             }
            
        }
    }
}