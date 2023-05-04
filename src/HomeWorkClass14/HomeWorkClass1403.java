package HomeWorkClass14;

public class HomeWorkClass1403 {

        // Write a method to return whether given number is prime or not?

        boolean isPrime(int number) {
            boolean prime = false;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && number != i) {
                    prime = false;
                    break;
                } else if (i == number) {
                    prime = true;
                }
            }
            return prime;
        }

        public static void main(String[] args) {

           HomeWorkClass1403 input = new HomeWorkClass1403();
            System.out.println(input.isPrime(9));
        }


    }


