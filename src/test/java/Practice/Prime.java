package Practice;

public class Prime {
    public static void main(String[] args) {

        isPrime(105);
    }

public static void isPrime(int n){
    boolean isPrime=true;
    for (int i=2 ; i<n ; i++){

        if (n%i==0){
           isPrime=false;break; }
        else isPrime=true;

      }System.out.println(isPrime);
    }

}
