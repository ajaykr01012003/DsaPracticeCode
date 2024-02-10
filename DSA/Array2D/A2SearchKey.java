package Array2D;

public class A2SearchKey {
    public static boolean searchKey(int matrix[][], int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if (key==matrix[row][col]) {
                System.out.println("fount key at index ("+row+", "+col+")");
                return true;
            }else if (key>matrix[row][col]) {
                row++;
            }else{
                col--;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        System.out.println(searchKey(matrix, 16));
    }
}
