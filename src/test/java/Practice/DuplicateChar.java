package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        //print once any chars which are duplicates exm=input :{'a','a','c','a','c','f','c','c'}
        // output : y = [a, c]

        char[] x = {'a','f','c','z','z','f','c','c'};
        System.out.println("y = " + charDon(x));

    }
public static Set<Character> charDon(char [] arr){
    Set<Character> y =new HashSet<>();

    for (int i = 0; i < arr.length ; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (i==j)continue;
            if (arr[i]==arr[j]){
                y.add(arr[i]);
            }
        }
    }
    return y;
}

}
