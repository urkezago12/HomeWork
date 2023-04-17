package HomeWorkClass10;

public class HomeWorkClass102 {
    public static void main(String[] args) {
        String [][] cars={
                {"ford","dodge","gmc"},
                {"bmw","audi","mercedes"},
                {"kia","hundai"},
                {"ferari","maserati","alfa"}
        };
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.println(cars[i][j]+" ");
            }
            System.out.println();
        }
        for (String[] car:cars){
            for(String Jcars: car){
                System.out.println(Jcars+" ");
            }
        }

        }
    }
