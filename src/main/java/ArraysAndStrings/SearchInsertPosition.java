package ArraysAndStrings;
//https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        System.out.println("The insert position of 6 is : "+ searchInsertposition(arr,6));

    }
    public static int searchInsertposition(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>=target){
                ans = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return ans;
    }
}
