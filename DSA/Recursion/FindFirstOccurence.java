package Recursion;

public class FindFirstOccurence {
    public static int findFirstOccurence(int arr[], int key, int i){
        if (i==arr.length-1) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return findFirstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int []arr={1,23,5,7,8,9,6,5,9,3,2};
        System.out.println(findFirstOccurence(arr,3,0));
    }
}
