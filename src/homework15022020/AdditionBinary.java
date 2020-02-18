package homework15022020;

import java.util.Scanner;

public class AdditionBinary {

        // declaration of main method

        public static void main(String[] args) {

        // declaration of Variables
        String a;
        String b;
        // creation of scanner object
        Scanner scan = new Scanner(System.in);

        // calling binary through scanner

        System.out.println("Insert First Binary : ");
        a = scan.nextLine();

        // calling binary through scanner
        System.out.println("Insert Second Binary : ");
        b = scan.nextLine();

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1+b1;



        // printing statement for addition of two binary numbers
        System.out.println("Sum of Two Binary Numbers : " +Integer.toBinaryString(c1));


    }
}
