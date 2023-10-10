package Practice;

public class reverseNumber {
    public static void main(String[] args) {

        int  num =45;
        int reverse=0;
        int reminder;

while (num!=0){
    reminder=num%10;
    reverse=reverse*10+reminder;
    num=num/10;
}
        System.out.println("reverse = "+ reverse);
    }

}
