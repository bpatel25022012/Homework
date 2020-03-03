package homework15022020;

import java.util.Scanner;

public class AverageNumber {

        public static void main(String[] args) {// declaration of main method
                Scanner scan = new Scanner (System.in);// creating scanner

        double a;// declaration of variable
        double b;
        double c;
        double avg;

        System.out.println("Enter First Number : ");// calling variable a
        a = scan.nextDouble();

        System.out.println("Enter Second Number : ");// calling variable b
        b = scan.nextDouble();

        System.out.println("Enter Third Number : ");// calling variable c
        c = scan.nextDouble();

        avg = (a+b+c)/3; // using avg formula

        System.out.println(" The average of above 3 Numbers is = " + avg); // printing statement for average
                scan.close();
    }
}
