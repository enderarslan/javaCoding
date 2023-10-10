package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class sortList {
    public static void main(String[] args) {

        //arraylist i sort
        ArrayList<Integer> liste =new ArrayList<>(Arrays.asList(4,5,234,-90,7,-100));

        for (int i = 0; i < liste.size()-1 ; i++) {
            if (liste.get(i)>liste.get(i+1)){
                int temp=liste.get(i);
                liste.set(i,liste.get(i+1));
                liste.set(i+1,temp);

                i=-1;
                System.out.println(liste);
            }
        }


    }
}
