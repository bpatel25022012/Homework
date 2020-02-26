package homework15022020;

import java.util.Scanner;

public class Rectangle {
// declaration of main method
    public static void main(String[] args) {
        // declaration of variable
    double widht;
    double height;
    double area;
    double perimeter;
    // creation of scanner
        Scanner scan = new Scanner (System.in);

        // calling variable through scanner
        System.out.println("Please Enter the Widht : ");
        widht = scan.nextDouble();

        System.out.println("Please Enter the Height : ");
        height = scan.nextDouble();

        // creating of formula
        area = widht*height;
        perimeter = 2 * (widht + height);

        // printing statement
        System.out.println("The Area of Rectangle is = "+ area);
        System.out.println(" The Perimeter of Rectangle is = "+ perimeter);




    }
}
