package ArraysAndStrings;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {1,3,3,4,6,7,9};
//        System.out.println("Upper bound of the element 3 is : "+ upperBound(nums,3));
//        System.out.println("Upper bound of the element 4 is : "+ upperBound(nums,4));
        System.out.println("Upper bound of the element 9 is : "+ upperBound(nums,9));
        System.out.println("Upper bound of the element 12 is : "+ upperBound(nums,12));

    }
    public static int upperBound(int[] arr,int target){
        // upperbound --> smallest index such that arr[index]> target
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==target){
                ans = m+1;
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
}
