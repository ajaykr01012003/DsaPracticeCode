package Recursion;

public class FindLastOccurence {


    public static int findLastOccurence(int arr[], int key, int i){
        if (i==arr.length-1) {
            return -1;
        }
       int isFound= findLastOccurence(arr, key, i+1);
        if (isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
     
    }
    public static void main(String[] args) {
        int []arr={1,23,5,7,8,9,6,5,9,3,2};
        System.out.println(findLastOccurence(arr,5,0));
    }
}


