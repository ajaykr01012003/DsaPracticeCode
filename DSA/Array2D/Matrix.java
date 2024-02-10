package Array2D;

import java.util.Scanner;

public class Matrix {
    public static boolean search(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if (arr[i][j]==key) {
                    System.out.print("   found at index"+" ("+ i+ " ,"+j+" )");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix Element M x N = ");

        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][]arr=new int[n][m];
   System.out.println(" Matrix Element ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        search(arr, 5);
      

    }
}
