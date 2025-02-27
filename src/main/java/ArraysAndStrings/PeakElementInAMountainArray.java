package ArraysAndStrings;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakElementInAMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6};
        //System.out.println(peak(arr));
        System.out.println(findPeak(arr));

    }
    public static int findPeak(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            int m = s +(e-s)/2;
            if(nums[m]>nums[m+1])e = m;
            else{
                s = m+1;
            }
        }
        return s;
    }
    public static int peak(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int ans  =-1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[m]>nums[m+1]&& nums[m]>nums[m-1]){
                ans = m;
                return ans;
            }
            else if(nums[m]<nums[m+1]){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return ans;
    }
}
