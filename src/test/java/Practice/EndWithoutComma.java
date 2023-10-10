package Practice;

public class EndWithoutComma {
    public static void main(String[] args) {
        String a = "benim adim ender bahar";
        String [] z = a.split(" ");
        for (int i=0 ; i<z.length-1 ;i++ ){
            System.out.print(z[i]+",");
        }
        System.out.println(z[z.length-1]);
    }
}
