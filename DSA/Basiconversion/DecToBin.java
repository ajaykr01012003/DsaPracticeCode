public class DecToBin {
    public static void DeToBin(int D){
        int pow=0,BinNum=0;
        while(D!=0){
            int rem=D%2;
            BinNum=BinNum + ( rem*(int)Math.pow(10, pow));
            pow++;
            D=D/2;
        }
        System.err.print(BinNum +" ");
    }
    public static void main(String[] args) {
        DeToBin(10);
    }
}
