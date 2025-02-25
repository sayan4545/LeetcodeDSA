package ArraysAndStrings;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,6};
        System.out.println(Arrays.toString(firstAndLastOccurence(arr,4)));


    }
    public static int[] firstAndLastOccurence(int[] nums,int target){
        int lb = lowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{lb, upperBound(nums, target) - 1};
        }
    }
    public static int lowerBound(int[] arr, int target){
        // smallest index such that arr[index] >= target.
        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        // This is because, if the target element is not in the array, the lower bound will be
        // the hypothetical next index of the array.
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] >= target) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr,int target){
        // upperbound --> smallest index such that arr[index]> target
        int s = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > target) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;

    }
}
