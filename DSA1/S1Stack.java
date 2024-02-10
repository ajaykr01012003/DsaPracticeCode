package DSA1;

import java.util.Stack;

public class S1Stack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(20);
        System.out.println(st);
        
        //Stack<Integer>st=new Stack<>();
        st.push(20);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        //st.peek();
        System.out.println(st.peek()+" "+st.size());
        
    }
}
