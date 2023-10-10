package Practice;

public class BlockInt {
    public static void main(String[] args) {

        String x = "asd45asd23sd10a";

        System.out.println("result " + blockInt(x));
    }

    public static int blockInt(String x) {
        int sum=0;
        String y="";

        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(x.charAt(i))){
                y+=x.charAt(i);

            }
            else {sum+=Integer.parseInt(y);
                y="0";}
        }
    return sum;}

}
