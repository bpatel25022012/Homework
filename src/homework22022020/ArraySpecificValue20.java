package homework22022020;

// this programme is to find the specific value in array

import java.util.Scanner;

public class ArraySpecificValue20 {

    // declaration of array method

    public static void main(String[] args) {
        array();
    }

    // declaration of user define method

    public static void array() {

        // declaration of array variable


        int n, x, i;

        // Scanner declaration and print stament for input

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the no. of Elements you want in array :");

        n = scan.nextInt();
        int[] a = new int[n];

        // print statement for elements of array

        System.out.println("Enter all the Elements");

        // for loop for array elements
        for (i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        // printing statement for array elements to find

        System.out.println("Enter the Elements you want to find : ");
        x = scan.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Elements found at position :" + (i + 1));
            }

        }

    }
}