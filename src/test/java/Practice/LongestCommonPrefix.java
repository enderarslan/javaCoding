package Practice;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        //longest common prefix

        String [] x = {"eneder","enever","ern"};


        System.out.println(longestCommonPrefix(x));
    }
    public static String longestCommonPrefix(String[] arr){
        String prefix=arr[0];
        for (int i = 1; i < arr.length; i++) {
                while (arr[i].indexOf(prefix)!=0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.length() == 0) {
                        return "no prefix";
                    }
                }
        }
   return prefix ; }


}