package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTheory {
    public static void main(String[] args) {
        // declaring an array
        int [] rnos ;
        // This is declaring the variable in the stack. dataype is integer.
        // datatype defines the type of the items we can store in the array.
        // array is collection of datatypes.
        rnos = new int[10];
        // This is defining or creating the object in the heap memory.size is pre defined.
        // The decalaration thing happens at compile time, and the object creation in the heap memory happens
        // at run time
        // inn C++, arrays are continuous memory location. There is no solid
        //proof of this in java. It depends on the JVM
        // there is 0 based indexing in arrays.
        //System.out.println(rnos[0]); // This will give 0 as o/p. Since Integer type.
        // had it been a string type, it would have resulted in null.
        //String[] strArray = new String[6];
        //System.out.println(strArray[2]); // null
        // null is a special literal. null can be assigned to non primitives. but cant be assignesd to primituives
        // null can be used as declaration type too.
        // Internal working of object arrays-->
        // String[] arr = new String[10] --> Here arr is stored in the stack memory. The heap memory has 10n references
        // of the String objects that is stored in different memory locations of heap. The arr points to the
        // array of 10 references of the string objects stored as array.
        Scanner sc = new Scanner(System.in);
        //int [] arr1 = new int[5];
//        System.out.println("Taking input from the array..");
//        for(int i=0;i<arr1.length;i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int num:arr1){
//            System.out.print(num+" ");
//        }

//        String[] strArr1 = new String[5];
//        System.out.println("taking input for the string array..");
//        for(int i=0;i<strArr1.length;i++){
//            strArr1[i] = sc.nextLine();
//        }
//        System.out.println(Arrays.toString(strArr1));
//        arr1[0] = 1;
//        arr1[1] = 2;
//        arr1[2] = 3;
//        arr1[3] = 4;
//        arr1[4] = 5;
//        System.out.println(Arrays.toString(arr1));
//        change(arr1);
//        System.out.println(Arrays.toString(arr1));
        // When the change() is called, the copy of the array arr1 is passed to the function.
        // num points to the same array now. The change made by tyhe fumnction now reflects in the main method too.
        // 2D arrays --> deals with rows and columns
        // declaratuion and initialisation
        int[][] twoDArray1 = new int[3][3];
        // In the RHS , the fierst size denotes the suize opf the rows, the second size denotes size of the columns.
        // To specify the size of the column is not mandatory
//        for (int row =0;row<twoDArray1.length;row++){
//            for(int col =0;col<twoDArray1[row].length;col++){
//                twoDArray1[row][col] = sc.nextInt();
//            }
//        }
//        for(int row =0;row<twoDArray1.length;row++){
//            for(int col =0;col<twoDArray1[row].length;col++){
//                System.out.print(twoDArray1[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for(int row =0;row<twoDArray1.length;row++){
//            System.out.println(Arrays.toString(twoDArray1[row]));
//        }
//        for(int[] arr : twoDArray1){
//            System.out.println(Arrays.toString(arr));
//        }
        /*
        How it is stored internally? --> It can be assumed as an array of arrays. In the stack memory twoDArray1 is stored.
        It points to the heap memory that has reference of three arrays stored in an array .
        How many number of rows are stored matters, but the sixe of the individual rows do not matter .
         */

//        int[][] num2 = new int[][]{{1,2,3},{4,5,6,7,8},{1,2}};
//        for(int[] num : num2){
//            System.out.println(Arrays.toString(num));
//        }
        /*
        Why column no is not madatory?

         */
        // Dynamic arrays --> ArrayList. part of collection framework
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for(int i=0;i<3;i++){
//            list.add(new ArrayList<>());
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                list.get(i).add(sc.nextInt());
//            }
//        }
//        for(int i=0;i<list.size();i++){
//            for(int j=0;j<list.get(i).size();j++){
//                System.out.println(list.get(i).get(j));
//            }
//            System.out.println();
//        }
        //System.out.println(list);

        int [] arr = {1,2,3,4,5,6,6,6};
        System.out.println(Arrays.toString(arr));
        //swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum in the array is : "+ max(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));



    }
    public static void change(int[] num){
        num[0]= 100;
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static int max(int[] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
