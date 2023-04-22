package HomeWorkGroupProjectPart1;

public class Task9 {
    public static void main(String[] args) {
        int[] number = {150, 340, 225, 370, 480, 723, 90};

        int largest = number[0];
        int secLarge = 0;


        for (int j : number) {
            if (j > largest) {
                secLarge = largest;
                largest = j;
            } else if (j > secLarge) {
                secLarge = j;

            }

        }
        System.out.println(secLarge);
    }
    }

