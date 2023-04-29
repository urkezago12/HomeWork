package HomeWorkClass12;

import java.util.Scanner;

public class HomeWorkClass1203 {
    public static void main(String[] args) {
            /*Write a program that reads two people's first
        names and if they expecting boy or girl? Based on the input suggests a name for a baby:
              Example Output:
           Mom’s first name? Mary
             Dad’s first name? Daniel
               Boy or Girl? boy
              Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("mom's first name");
        String momName=scanner.nextLine();
        System.out.println("dad's first name");
        String dadName=scanner.nextLine();
        String gender=scanner.nextLine();
        gender=gender.toLowerCase();
        if(gender.equals("boy")){
            System.out.println(dadName.toUpperCase().substring(0,dadName.length()/2)+momName.toUpperCase().substring(momName.length()/2));
        }else if(gender.equals("girl")) {
            System.out.println(momName.toUpperCase().substring(0,momName.length()/2)+dadName.toUpperCase().substring(dadName.length()/2));

        }
        }
    }

