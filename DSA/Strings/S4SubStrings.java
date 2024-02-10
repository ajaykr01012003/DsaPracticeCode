package Strings;

public class S4SubStrings {
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei;i++){
             substr+=str.charAt(i);   
        }
        return substr;
    }
    public static void main(String[] args) {
        String substr="helloworld";
       System.out.println( substr.substring(0, 3));
        System.out.println(substring(substr, 0, 3));
    }
}
