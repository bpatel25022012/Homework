package homework22022020;


/* this programme input any two number and ask user to enter their symbol (+, -, /, *) find addition,
/Subtraction, multiplication and division according to their symbol (using if else)
*/


import java.util.Scanner;

public class AddSubDivMul10 {

    // declaration of main method

    public static void main(String[] args) {

        addsubdivmul(); // calling user define method to main method

    }
    // user define method

    public static void addsubdivmul() {

        // declaration of variables
        double x;
        double y;
        char ch;
        double add;
        double sub;
        double multi;
        double div;


        // declaration of scanner
        Scanner scan = new Scanner(System.in);

        // calling input number through scanner and print statement

        System.out.println("Please Enter Number1");
        x = scan.nextDouble();

        System.out.println("Please Enter Number2");
        y = scan.nextDouble();

        System.out.println("Please Enter the method you want to use");
        ch = scan.next().charAt(0);
        scan.close();
        //  declaration of add , sub , multi and div method
        add = x + y;
        sub = x - y;
        multi = x * y;
        div = x / y;
        // using if condition and print statement
        if (ch == '+') {
            System.out.println("Addition of Number1 and Number2 is :" + add);

        } else if (ch == '-') {
            System.out.println("Substraction of Number1 and Number2 is :" + sub);

        } else if (ch == '*') {
            System.out.println("Multipliction of Number1 and Number2 is :" + multi);

        } else if (ch == '/') {
            System.out.println("Division of Number1 and Number2 is :" + div);
        }


    }

}



