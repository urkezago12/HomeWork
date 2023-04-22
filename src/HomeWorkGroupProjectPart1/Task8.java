package HomeWorkGroupProjectPart1;

public class Task8 {
    public static void main(String[] args) {
        int[] number = {150, 340, 225, 370, 480, 723, 90};
        int largest = number[0];
        int smallest = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }

        }
        System.out.println("largest number is " + largest);

        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }

        }
        System.out.println("Smallest number is " + smallest);

        System.out.println("-----------");

        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
            if (number[i] < smallest) {
                smallest = number[i];
            }


        }
        System.out.println("Smallest number is " + smallest);
        System.out.println("largest number is " + largest);
    }
}


