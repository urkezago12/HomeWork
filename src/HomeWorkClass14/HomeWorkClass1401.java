package HomeWorkClass14;

public class HomeWorkClass1401 {

    /*
Create a method that will say Hello in different language based on the
country that will passed when method is executed.
*/
    void hello(String language) {
        switch (language) {
            case "english":
                System.out.println("hello");
                break;
            case "serbian":
                System.out.println("Zdravo");
                break;
            case "french":
                System.out.println("bonjour");
                break;
            case "japanese":
                System.out.println("Kon'nichiwa");
                break;
            default:
                System.out.println("invalid input");
        }
    }

}

