package homework22022020;

import java.util.Scanner;

//Write a Java program to sum values of an array.


public class SumOFArray17 {

    // declaration of main method

    public static void main(String[] args) {
        // calling user define method

        array();
    }
    // user define method

    public static void array() {

        // calling scanner for elements  in array

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the no. of Elements you want in array :");

        int n = scan.nextInt();
        int total = 0;
        int[] a = new int[n];

        // for loop statement
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the Elements" + " " + (i + 1) + "");
            a[i] = scan.nextInt();
        }
        scan.close();
        for (int value : a) {
            total = total + value;
        }
        // printing statement
        System.out.println("The Sum of Array Element is " + total);
    }

}


