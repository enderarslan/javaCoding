public class PerfectNumber {
    public static void main(String[] args) {

        int sum,j;

        for ( j = 1; j <101 ; j++) {
            sum=0;

            for (int i = 1; i <= j/2; i++) {
            if (j%i==0 ){
                sum+=i;
            }

        }
            if (sum==j){
                System.out.println(sum);
            }}
    }
