package ArraysAndStrings;
// https://leetcode.com/problems/binary-search/description/
public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int binarySearch(int[] nums , int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                ans = m;
                return ans;
            } else if (nums[m]>target) {
                e = m-1;

            }else{
                s = m+1;
            }
        }
        return ans;
    }
}
