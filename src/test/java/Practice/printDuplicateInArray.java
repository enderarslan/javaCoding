package Practice;

import java.util.HashSet;
import java.util.Set;

public class printDuplicateInArray {
    public static void main(String[] args) {

        int[] a = {4, 6, 2, 4, 6, 9};
        System.out.println("printDups(a) = " + printDups(a));
    }

    public static String printDups(int[] arr) {
        Set<Integer> x = new HashSet<>();
        String d="";
        for (int each : arr) {
            if (!x.add(each)) {
                 d += each +",";
            }
    }
return d;}}
