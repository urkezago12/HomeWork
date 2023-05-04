package HomeWorkClass13;

public class HomeWorkClass1303 {
    public static void main(String[] args) {
        /*
         Task2:
         How would you check if String is name or not? aba=> true
         Abbc => false
          */



        String name="aba";
        name=name.toLowerCase();
        StringBuilder str1=new StringBuilder(name);
        str1.reverse();
        String name2=str1.toString();
        if(name.equals(name2)){
            boolean isTrue=true;
            System.out.println(isTrue);
        }else{
            System.out.println("False");
        }
    }
}
