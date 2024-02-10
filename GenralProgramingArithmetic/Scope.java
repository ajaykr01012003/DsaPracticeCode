public class Scope {
    public static void main(String[] args) {
        int first=10;
        int second=20;
        int third=30;

        {
           //   int third=second-first;
            System.err.println(third);
        }
        System.err.println(third);
    }
}
