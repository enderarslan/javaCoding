package Practice;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {

    public static void main(String[] args) {

        String  x ="24";
        String [] arr=x.split("");

        List<String> liste=new ArrayList<>();

        for (String s : arr) {
            switch (s) {
                case "2":
                    liste.add("a");
                    liste.add("b");
                    liste.add("c");
                    break;
                case "3":
                    liste.add("d");
                    liste.add("e");
                    liste.add("f");
                    break;
                case "4":
                    liste.add("g");
                    liste.add("h");
                    liste.add("i");
                    break;
                case "5":
                    liste.add("j");
                    liste.add("k");
                    liste.add("l");
                    break;
                case "6":
                    liste.add("m");
                    liste.add("n");
                    liste.add("o");
                    break;
                case "7":
                    liste.add("p");
                    liste.add("r");
                    liste.add("s");
                    break;
                case "8":
                    liste.add("t");
                    liste.add("u");
                    liste.add("v");
                    break;
                case "9":
                    liste.add("w");
                    liste.add("x");
                    liste.add("y");
                    liste.add("z");
                    break;
            }
        }

        for (int i = 0; i < liste.size(); i++) {
            for (String s : liste) {
                System.out.println(liste.get(i) + s);
            }
        }
    }
}
