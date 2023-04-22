package HomeWorkGroupProjectPart1;

public class Task3 {
    public static void main(String[] args) {
        int[][] num={
                     {1,2,4,5},
                     {50,7,70,90},
                     {5,8,80,91,100},
                    };

        for(int [] num1D:num){
            for(int element:num1D){
                if(element%2==0){
                    System.out.print(element+" ");
                }
            }
        }
    }
}
