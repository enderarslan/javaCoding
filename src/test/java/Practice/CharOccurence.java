package Practice;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {
    public static void main(String[] args) {
        String str= "enderbaharkejfbjhsvfshdzbdfbshiabvhfsvasbdfhdasvfhgvadshfvadhsvfavsdfvgadsjhfvdhsajf";
    char []x =str.toCharArray();
        Map<Character , Integer> map= new HashMap<>();

        for (char each:x ){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }
            else map.put(each,1);}
        System.out.println(map);
    }

}
