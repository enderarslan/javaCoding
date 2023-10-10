package Practice;

public class reverseStringPiece {
    public static void main(String[] args) {
        String str="My name is Ender";

        String y="Ender";
        StringBuilder z = new StringBuilder();
        for (int i = y.length()-1; i >=0 ; i--) {
            z.append(y.charAt(i));
        }
        y=str.replace(y, z.toString());
        System.out.println(y);
    }
}
