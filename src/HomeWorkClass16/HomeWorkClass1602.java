package HomeWorkClass16;

public class HomeWorkClass1602 {
     /*
    Create a method that will accept a String as a parameter and return a new
    String that consist only of vowels. Method should be available inside the
     class only where it was declared and executed by calling it is name
     */

    private String vowels(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HomeWorkClass1602 obj = new HomeWorkClass1602();
        System.out.println(obj.vowels("Today is Friday"));
    }
}

