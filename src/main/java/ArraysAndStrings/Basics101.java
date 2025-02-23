package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Basics101 {
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
        System.out.println(rnos[0]); // This will give 0 as o/p. Since Integer type.
        // had it been a string type, it would have resulted in null.
        String[] strArray = new String[6];
        System.out.println(strArray[2]); // null
    }
}
