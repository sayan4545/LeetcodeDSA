package ArraysAndStrings;

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
        System.out.println(a==b);
        System.out.println(a.equals(b));



    }
}
