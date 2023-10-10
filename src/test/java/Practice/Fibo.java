package Practice;

public class Fibo {

    public static void main(String[] args) {
// 0 dan n kadar fibonacci sayisini yazdiriniz
        int n=10;
        int i=1;
        int first=0;
        int second=1;
        do {
            System.out.print(first+",");
            int next=first+second;
            first=second;
            second=next;
            i++;
        }while(i<=n);



    }
}
