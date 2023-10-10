package Practice;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int [] arr={4,5,1,9,0};

        addElementToArray(arr,45);
//tryabc
    }

    public static void addElementToArray(int[] arr, int y) {
        int [] arr2=Arrays.copyOf(arr, arr.length+1);

        arr2[arr2.length-1]=y;
        System.out.println(Arrays.toString(arr2));
    }
}
