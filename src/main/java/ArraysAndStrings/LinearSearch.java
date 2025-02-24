package ArraysAndStrings;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isFound(arr,5));
        System.out.println(llinearSearch(arr,5));
    }
    public static boolean isFound(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int llinearSearch(int[] arr, int target){
        int key = -1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                key = i;
            }
        }
        return key;
    }
}
