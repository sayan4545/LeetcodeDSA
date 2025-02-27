package ArraysAndStrings;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4};
        System.out.println(findElement(arr,7));
        System.out.println(findTargetElement(arr,3));//7
        int[] arr2 = {3,3,4,4,5,5,1,2,3};
        System.out.println(findElementWithDuplicates(arr2,4));
        System.out.println(findElementWithDuplicates(arr2,1));
        System.out.println(findElementWithDuplicates(arr2,8));


    }
    public static int findElement(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target) {
                return m;
            }
            else if(m+1<nums.length && nums[m]>nums[m-1] && nums[m]>nums[m+1]){
                if(nums[m]>target && nums[s]<=target){
                    e = m-1;

                }else{
                    s = m+1;
                }
            }
            else if(nums[m]<target){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return -1;
    }
    public static int findTargetElement(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[m]==target) return m;
            else if(nums[s]<=nums[m]){
                if(target>=nums[s] && target <=nums[m]){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
            else{
                if(target>=nums[m] && target <= nums[e]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }

        }
        return -1;
    }
    public static boolean findElementWithDuplicates(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target) return true;
            if(nums[s]==nums[m] && nums[m]==nums[e]){
                e = e-1;
                s = s+1;
            }
            else if(nums[s]<=nums[m]){
                if(target>=nums[s] && target <=nums[m]){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
            else{
                if(target>=nums[m] && target <= nums[e]){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }
        }
        return false;
    }
}
