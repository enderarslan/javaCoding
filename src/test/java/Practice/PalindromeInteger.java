package Practice;

public class PalindromeInteger {

    public static void main(String[] args) {

        System.out.println(palindrome(457541));

    }
    public static boolean palindrome(int x){
        String y=String.valueOf(x);
        StringBuilder z= new StringBuilder();
        for (int i = y.length()-1 ; i >= 0; i--) {
            z.append(y.charAt(i));
        }

        return y.contains(z.toString());
    }


}
