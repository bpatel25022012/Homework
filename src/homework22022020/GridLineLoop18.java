package homework22022020;

import java.util.Scanner;

// This programme is to print grid and any other alphbet/ symbol and  line using loop
public class GridLineLoop18 {

    // declaration of main method
    public static void main(String[] args) {

        // calling user define method in main method
        grid();
    }

    // declaration of user defined method

    public static void grid() {
        // variable declaration
        int i = 0;
        String b;
        // scanner declaration
        Scanner scan = new Scanner(System.in);
        // calling cariable through scanner
        System.out.println("Please enter any character to print the grid line :");
        b = scan.nextLine();
        // using do while loop
        do {
            System.out.println(b + b + b + b + b + b + b + b + b + b);
            i++;
        } while (i < 10);
        scan.close();
    }
}

