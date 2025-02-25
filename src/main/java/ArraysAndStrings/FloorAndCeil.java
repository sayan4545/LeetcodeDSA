package ArraysAndStrings;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9};
        System.out.println("The floor of 1 is : " + floor(arr,1));
        System.out.println("The floor of 7 is : " + floor(arr,7));
        System.out.println("The ceil of 5 is : "+ ceil(arr,5));
        System.out.println("The ceil of 10 is " + ceil(arr,10));
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
    public static int ceil(int[] num,int target){
        int s = 0;
        int e = num.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(num[m]>=target){
                ans = num[m];
                e= m-1;
            }else{
                s = m+1;
            }
        }
        return ans;
    }
}
