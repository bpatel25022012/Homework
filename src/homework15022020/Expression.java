package homework15022020;

import java.util.Scanner;

public class Expression {

        public static void main(String[] args) {// main method creation

        Scanner scan = new Scanner (System.in); // scanner object creation

        double a;// declaration of variable
        double b;
        double c;
        double d;
        double e;

        // calling variable through scanner
    System.out.println("Enter Any Specified Expression : ");
        a = scan.nextDouble();
        System.out.println("Enter Any Specified Expression : ");
        b = scan.nextDouble();
        System.out.println("Enter Any Specified Expression : ");
        c = scan.nextDouble();
        System.out.println("Enter Any Specified Expression : ");
        d = scan.nextDouble();

        // creation of formula

        e = (((a*b)-(b*b))/(c - d));

        // print statement for result
        System.out.println("The result is = " + e);


            }

}