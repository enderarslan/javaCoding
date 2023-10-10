package Practice;

public class OccurenceOfWord {
    public static void main(String[] args) {
        //bir string in icinde belli bir string in kac defa gectigini bulunuz
        
        String x = "catcatdogcatdogdogsnakebee";
        
        String y="snake";

        String z=x.replaceAll(y,"");
        int diff=x.length()-z.length();
        int diff2=diff/y.length();
        System.out.println("diff2 = " + diff2);
        

        

        






    }


}
