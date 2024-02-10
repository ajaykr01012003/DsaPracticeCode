package DSA1;

import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==index){
                index=i;
                System.out.println("index : "+index);
                break;
            }
        }
    }
}
