package DSA1;

import java.util.Scanner;
import java.util.Stack;

public class S3BanlancedB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
                boolean val=HandleClosing(st, '(');
                if(val==false){
                    System.out.println(val);
                }
            }else if(ch=='}'){
                boolean val=HandleClosing(st, '{');
                  if(val==false){
                    System.out.println(val);
                }
            }else if(ch==']'){
              boolean val=  HandleClosing(st, ']');
                  if(val==false){
                    System.out.println(val);
                }
            }else{

            }
            if(st.size()==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        }

    }
    public static boolean HandleClosing(Stack<Character> st, char opchar){
        if(st.size()==0){
            System.out.println(false);
            return false;
        }else if(st.peek()!=opchar){
            System.out.println(false);
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
