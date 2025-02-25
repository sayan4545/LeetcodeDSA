package ArraysAndStrings;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println("The lower bound of 1 is : "+lowerBound(nums,1));

    }
    public static int lowerBound(int[] arr, int target){
        // smallest index such that arr[index] >= target.
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;
        // This is because, if the target element is not in the array, the lower bound will be
        // the hypothetical next index of the array.
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                ans = m;
                e = m-1;
            }
            else if(arr[m]>target){
                ans = m;
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return ans;
    }
    //TC --> O(logn)

}
