package HomeWorkGroupProjectPart1;

public class Task4 {
    public static void main(String[] args) {
        int[][] num = {
                       {1, 2, 4, 5},
                       {50, 7, 70, 90},
                       {5, 8, 80, 91, 100},
                       };

        int evenSum=0;
        int oddSum=0;

        for(int[] num1D:num){
            for(int element:num1D){
                if(element%2==0){
                    evenSum=evenSum+element;

                }else if(element%2!=0){
                    oddSum=oddSum+element;
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
