package homework15022020;

import java.util.Scanner;

public class DecimalToBinary {
    // declaration of main method
    public static void main(String[] args) {

        // declaration of variable
        int a;

        // creation of scanner object

        Scanner scan = new Scanner (System.in);

        // calling variable through scanner

        System.out.println("Please enter Decimal Number : ");
        a=scan.nextInt();

        // interger to binary

        String b = Integer.toBinaryString(a);

        // printing statement for binary

        System.out.println("Binary Number is : " + b);




    }
}
