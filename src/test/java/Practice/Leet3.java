package Practice;

import java.util.HashSet;

public class Leet3 {
    public static void main(String[] args) {
        String s ="enderbahar";
        HashSet<Character> liste = new HashSet<>();
        int a=0;
        int b=0;
        int m =0;
        while (b<s.length()){
            if (!liste.contains(s.charAt(b))){
                liste.add(s.charAt(b));//
                b++;
                m=Math.max(liste.size(),m);
            }else{
                liste.remove(s.charAt(a));
                a++;
            }
        }
        System.out.println(m);
    }
}
