package Practice;

public class WordSeperator {
    public static void main(String[] args) {


seperator("abc","X",10);

    }
    public static void seperator(String word,String sep,int n){
        int i=1;
        System.out.print(word);
        do {
            System.out.print(sep+word);
            i++;
                }
        while(i<n);



    }

}