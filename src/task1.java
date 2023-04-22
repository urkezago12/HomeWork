public class task1 {
    public static void main(String[] args) {


    int[] temp = {10, 20, -20, 83, 99, 76, 32};

    int highest = temp[0];
    int lowest = temp[0];

        for (int i = 1; i < temp.length; i++) {
        if (temp[i] > highest) {
            highest = temp[i];
        }

    }
        System.out.println("Highest = " + highest);
        System.out.println();

        for (int j = 0; j < temp.length ; j++) {
        if(temp[j]<lowest){
            lowest=temp[j];
        }

    }
        System.out.println("lowest = " + lowest);
}

}
