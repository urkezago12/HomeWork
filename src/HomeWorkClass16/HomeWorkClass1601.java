package HomeWorkClass16;

public class HomeWorkClass1601 {

    /*
    Create a method that will take a String as a parameter and returns reversed
    String. Method should be available to all classes within your project and
    accessible by class name.
     */

        public static String reverseStr(String str) {
            StringBuilder sb = new StringBuilder(str);

            return sb.reverse().toString();
        }

        public static void main(String[] args) {

            System.out.println(reverseStr("Hello"));
        }


    }


