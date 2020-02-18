package homework15022020;

import java.util.Scanner;

public class Rectangle {
// declaration of main method
    public static void main(String[] args) {
        // declaration of variable
    double Widht;
    double Height;
    double Area;
    double Perimeter;
    // creation of scanner
        Scanner scan = new Scanner (System.in);

        // calling variable through scanner
        System.out.println("Please Enter the Widht : ");
        Widht = scan.nextDouble();

        System.out.println("Please Enter the Height : ");
        Height = scan.nextDouble();

        // creating of formula
        Area = Widht*Height;
        Perimeter = 2 * (Widht + Height);

        // printing statement
        System.out.println("The Area of Rectangle is = "+ Area);
        System.out.println(" The Perimeter of Rectangle is = "+ Perimeter);




    }
}
