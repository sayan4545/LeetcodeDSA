package ArraysAndStrings;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9};
        System.out.println("The floor of 5 is : " + floor(arr,5));
        System.out.println("The floor of 7 is : " + floor(arr,7));

    }
    public static int floor(int[] num,int target){
        int s = 0;
        int e = num.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(num[m]<=target){
                ans = num[m];
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;

    }
}
