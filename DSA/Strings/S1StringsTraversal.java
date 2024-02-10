package Strings;

import java.util.Scanner;

public class S1StringsTraversal {
    public static void strings(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        strings(str);
        
    }
}
