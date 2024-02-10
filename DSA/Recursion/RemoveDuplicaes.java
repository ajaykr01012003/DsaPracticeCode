package Recursion;

public class RemoveDuplicaes {

    public static void remveDublcates(String str,int idx, StringBuilder sb, boolean map[]){

        if (idx==str.length()) {
           System.out.println(sb);
            return;

        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']==true) {
            remveDublcates(str, idx+1, sb, map);
        }else{
            map[currChar-'a']=true;
            remveDublcates(str, idx+1, sb.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str="ajay";
        remveDublcates(str, 0,new StringBuilder(""), new boolean[26]);
    }
    
}
