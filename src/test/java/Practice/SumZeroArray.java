package Practice;

import java.util.Arrays;

public class SumZeroArray {
    public static void main(String[] args) {
        System.out.println("sumZeroArr(5) = " + sumZeroArr(5));

    }

    public static String sumZeroArr(int num) {
        int [] arr=new int[num-1];
        int sum=0;

        for (int i=0 ;i< arr.length;i++) {
            arr[i]=i;
            sum+=arr[i];
        }

        int []arr2= Arrays.copyOf(arr,num);
        arr2[num-1]=-sum;
   return Arrays.toString(arr2); }
}
