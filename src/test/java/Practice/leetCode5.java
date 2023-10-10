package Practice;


// 28  suğper sayı : 1 2 4 7 14
public class leetCode5 {
    public static void main(String[] args) {

        int sum ;
        for (int i = 100; i > 0; i--) {
            sum = 0;
            for (int j = 1; j <= i / 2; j++) {

                if (i % j == 0) {
                    sum += j;
                   // System.out.println(j);
                }
            }
            if (sum == i) {
                System.out.println(i);
            }

        }


        System.out.println(fak(5));
    }
    public static int fak(int x ){

if (x==1 || x==0){
    return 1;
}
return x*fak(x-1);
}}

