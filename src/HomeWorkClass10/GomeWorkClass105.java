package HomeWorkClass10;

public class GomeWorkClass105 {
    public static void main(String[] args) {
             /*
        Create a 2D array or integer type where you will store odd and even numbers
        in 3 rows and 4 columns. Develop a program which will identify/print the even
        numbers only.
         */

        int[][] number = {{1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 14, 20}
        };

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    System.out.print(number[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}



