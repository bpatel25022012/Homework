package homework22022020;

import java.util.Scanner;

// Java program to calculate the average value of array elements.

public class AvgValueOfArray19 {

    // declaration of main method

    public static void main(String[] args) {

        array(); // calling user define method to main method
    }

    // declaration of user define method

    public static void array() {

        Scanner scan = new Scanner(System.in); // declaration of scanner
        System.out.println("Please Enter the no. of Elements you want in array :");
        // declaration of variable
        int n = scan.nextInt();
        int total = 0;
        int[] a = new int[n];
        // using for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the Elements" + " " + (i + 1) + "");
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int value : a) {
            total = total + value;
        }
        int avg = total / a.length;

        System.out.println("The average of Array Element is " + avg);
    }

}




