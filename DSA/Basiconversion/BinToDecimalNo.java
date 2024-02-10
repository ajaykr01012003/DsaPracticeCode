public class BinToDecimalNo {
    public static void BToDeciNo(int binNum) {

       int pow=0,DeciNo=0;

       while (binNum!=0) {

        int Ld=binNum%10;

        DeciNo=DeciNo + (Ld*(int)Math.pow(2, pow));
        pow++;

        binNum=binNum/10;
         
       }
        System.err.println(DeciNo);
    }
    public static void main(String[] args) {
        BToDeciNo(1001);
    }
    
}
