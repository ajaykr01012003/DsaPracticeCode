import java.util.*;

public class ReverseStringUsingStack {
    
    public static String revString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()) {
            char ch=s.pop();
            result.append(ch);
        }
        return result.toString();
         
    }
    
    public static void main(String[] args) {
        String str="Hello|World";
        System.out.println(revString(str));
    }
}
