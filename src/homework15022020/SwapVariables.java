package homework15022020;

import java.util.Scanner;

public class SwapVariables {
    // declaration of main method
    public static void main(String[] args) {
    // declaration of varibles
        double a;
        double b;
        double c;

        // creation of scanner object
        Scanner scan = new Scanner (System.in);

        // calling variable through scanner
        System.out.println("Enter the First Variable");
        a= scan.nextDouble();

        // calling variable through scanner
        System.out.println("Enter the Second Variable");
        b= scan.nextDouble();
        scan.close();
        // formula statement for variables
        c = a;
        a = b;
        b = c;
        System.out.println("The swapped variables are : "+ a + " And " + b);

    }
}
