package HomeWorkClass10;

public class HomeWorkClass106 {
    public static void main(String[] args) {
            /*
        Create 2D array of countries: north america countries, south america countries,
         europe countries, asian countries, african countries. Then print all values from
         that array using 2 different loops
        and calculate how many total countries been stored.
         */

        String[][] countries={{"usa","canada","mexico","cuba"},
                              {"argentina","brasil","bolivia","colombia"},
                              {"serbia","croatia","montenegro","bosnia"},
                              {"korea","china","japan","malasia"},
                              {"tunisia","morroco","egipt","burundi"}
                              };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+", ");

            }
            System.out.println();
        }
    }
}
