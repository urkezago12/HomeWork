package HomeWorkClass13;

public class HomeWorkClass1304 {
    public static void main(String[] args) {
        // How would you swap  2 strings without a temporary variable?


        String a="Marko";
        String b="Luka";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a+" "+b);

    }
}
