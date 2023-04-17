package HomeWorkClass10;

public class HomeWorkClass107 {
    public static void main(String[] args) {
        String[][] countries2D={{"usa","canada","mexico","cuba"},
                {"argentina","brasil","bolivia","colombia"},
                {"serbia","croatia","montenegro","bosnia"},
                {"korea","china","japan","malasia"},
                {"tunisia","morroco","egipt","burundi"}
                };

        for (String[]countries1D:countries2D) {
            for (String element:countries1D) {
                System.out.print(element+",");
            }
            System.out.println();
        }
    }
}
