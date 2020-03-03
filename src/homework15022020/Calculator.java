package homework15022020;

import java.util.Scanner;


public class Calculator {
        // main method declaration
        public static void main(String[] args) {

        // declaring scanner object

        Scanner scan = new Scanner(System.in);

        int a; // declaration of data type
        int b; // declaration of data type

        System.out.println("Enter the value of first number");// print statement for first number
        a = scan.nextInt();
        System.out.println("Enter the value of second number");// print statement for second number
        b = scan.nextInt();

            scan.close();
        Calculator cal = new Calculator();// object creating instance variable
        cal.addition(a, b);
        substration(a, b);
        cal.multiplication(a, b);
        devision(a, b);


    }

        public void addition(int a, int b) {// instance method with variable
        int result = a + b; // calculation for variable a and b
        System.out.println("Value of addition is : " + result); // printing statement for addition
    }

        public static void substration(int a, int b) {// static method with variable
        int result = a - b;// substraction for variable a and b
        System.out.println("Value of substraction is : " + result);// printing statement for substraction
    }

        public void multiplication(int a, int b) {// instance method with variable
        int result = a * b; // multiplication for variable a and b
        System.out.println("Value of multiplication is : "+ result); // printing statement for multiplication
    }

        public static void devision(int a, int b) { // static method with variable
        int result = a / b; // devision for variable a and b
        System.out.println("Value of divison is : " + result); // printing statement for devision
    }

}




