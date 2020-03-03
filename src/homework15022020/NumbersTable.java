package homework15022020;

import java.util.Scanner;

public class NumbersTable {

            // creation of main method
            public static void main(String[] args) {

            int number; // Declaration of data tye

            Scanner scan = new Scanner(System.in); // creating scanner object

            System.out.println("Enter the Number : "); // printing statement for number

            number = scan.nextInt(); // calling number with scanner

            for (int t = 1; t <=10; t++) {// for loop for int t

            System.out.println(number + " X " + t + " = " + number * t);
                scan.close();

        }
    }
}
