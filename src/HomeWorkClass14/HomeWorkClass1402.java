package HomeWorkClass14;

public class HomeWorkClass1402 {

        /*
Create a method createEmail(). Based on values of users firstName,
 lastName and email type, your method should return complete email Address.
  Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 */

        String createEmail(String firstName,String lastName,String emailType){
            String email=(firstName+ lastName+"@"+emailType+"com");
            return email;
        }

    public static void main(String[] args) {
       HomeWorkClass1402 input=new HomeWorkClass1402();
       System.out.println(input.createEmail("uki","zago","gmail"));
    }
        }



