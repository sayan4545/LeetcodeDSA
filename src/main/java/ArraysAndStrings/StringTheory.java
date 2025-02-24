package ArraysAndStrings;

import java.util.Arrays;

public class StringTheory {
    public static void main(String[] args) {
//        String a = "hey";
//        String b = "hey";
//        // Here in the heap memory, There is only single object hey. This separate memory space is
//        // called string pool. a and b both points to the same object.
//        /*
//        Now the question is, if the string object is changed via b variable, it will change the object
//        for a also. No, This doesnot happen in Strings, suince strings are immutable.
//         */
//        b = "Bey";
//        System.out.println("String b: "+ b);
//        System.out.println("String a: "+a);
        /*
        This is not immutabilty behaviour. What happens here is , the variable b now points
        another object Bey in the pool.
         */
        // comparison of strings
        String a = "Kunal";
        String b = "Kunal";
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
        String name = new String("Sayan");
        String anotherName = new String("Sayan");
        // Bty using the new keyword, these objectys are created ouytside the pool , but in the heap.
//        System.out.println(name==anotherName);
//        System.out.println(name.equals(anotherName));
//        String anotherName2 = anotherName;
//        System.out.println(anotherName==anotherName2);
//        System.out.println(anotherName2.equals(anotherName));
//        float d = 12.5677f;
//        System.out.printf("Formatted decimal number is %.2f",d);
        /*
        1. == operator --> it checks both the value and the reference variable. If they point to the same object, it gives true, otherwise false.
        2. .equals() method --> Only checks the value.
         */
        // Operators
//        System.out.println('a'+'b');// will compute the sum of the asccii value of characters a and b and sum it
//        System.out.println("a"+"b"); // ab , only concatenates the strings together.
//        System.out.println('a'+3);// will compute the ascii value of a and add it to 3
//        System.out.println((char)('a'+3));// will compute and then cast the ascii value back to character.
//        System.out.println("a"+1);// 1 is an integer, it will be casted to its wrapper class Integer, and the Integer class
//        // will call its toString() method.
//        System.out.println("Sayan"+ Arrays.toString(new int[]{1,2,3}));
//        // The operator + is defined only for primitives and with non primitives , only condition is that any
//        // one is String.
//        // String performance
//        String series = "";
//        for(int i=0;i<26;i++){
//            char ch = (char)('a'+i);
//            series = series + ch;
//        }
//        System.out.println(series);
//        // There is a performance issue with this above operation. Everytime a new object is created and the previous
//        // object is derefernced. This calls for memory overhead.
//        StringBuilder builder = new StringBuilder();
//        for(int i=0;i<26;i++){
//            char ch = (char)('a'+i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
        String str = "abccba";
        String str1 = "";
        String str2 = null;
        String str4 = "abcd";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str4));



    }
    public static boolean isPalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
