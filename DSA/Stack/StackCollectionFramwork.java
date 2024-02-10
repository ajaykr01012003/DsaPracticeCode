import java.util.*;

public class StackCollectionFramwork {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>(); 
        s.push(4);
        s.push(3);
        s.push(2);

        while (!s.isEmpty()) {
            
            System.out.println(s.peek());
            s.pop();

        }

    }
}
