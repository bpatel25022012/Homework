package homework29022020;

import java.util.Scanner;
/*
Read the numbers from the console entered by the user and
print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message •Enter
number: •
-If the user enters an invalid number, break out of the loop
and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
*/

public class MinAndMaxInputChallenge2 {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in);// scanner class

        int min = 0; // variable
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number (to exit enter any character): ");// printing statement
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) { // if condition

                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;

                }
                if (number > max) {
                    max = number;
                }
                if (number<min){
                    min=number;
                }
            } else {
                break;
            }
        }

        System.out.println("min= " + min + ", max=" + max); // printing statement
        scanner.close(); // scanner close
    }
}
