package ArraysAndStrings;

import java.util.Arrays;

public class FirstAndLastOccurenceUsingPlainBS {
    public static void main(String[] args) {
        int arr1[] = {};
        int arr2[] = {1,2,4,7,9,10};
        int arr3[] = {1,5,7};
        int arr4[] = {1,2,4,5,5,5,6,7};
        System.out.println(Arrays.toString(findfirstAndLastOccurence(arr4,5)));
        System.out.println(Arrays.toString(findfirstAndLastOccurence(arr1,3)));

    }
    public static int[] findfirstAndLastOccurence(int[] nums,int target){
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{firstOccurence(nums,target),lastOccurence(nums,target)};
        }
    }
    public static int lastOccurence(int[] nums, int target){
        int lastOccurence = -1;
        int s = 0;
        int e = nums.length -1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[m]==target){
                lastOccurence = m;
                s = m+1;
            }
            else if(nums[m]>target){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return lastOccurence;
    }
    public static int firstOccurence(int[] nums,int target){
        int firstOccuence = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                firstOccuence = m;
                e = m-1;
            }
            else if (nums[m]>target){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return firstOccuence;
    }
}
