package ArraysAndStrings;

public class MinimumInASortedArrayUnique {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int ans = nums[s];
        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[s]<=nums[m]){
                if(ans>nums[s]){
                    ans = nums[s];
                }
                s = m+1;
            }
            else{
                if(nums[m]<ans){
                    ans = nums[m];
                }
                e = m-1;
            }
        }
        return  ans;
    }
}
