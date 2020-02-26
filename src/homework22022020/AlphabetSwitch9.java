package homework22022020;

import java.util.Scanner;
/*Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry with Switch statement*/

public class AlphabetSwitch9 {
    // declaration of main method

    public static void main(String[] args) {

        // declaration of scanner and variable
        String alphabet;
        Scanner scan = new Scanner(System.in);

        // calling variable through scanner and print statment

        System.out.println("Please enter any alphabet between a to f ");
        alphabet = scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

        // use of switch statement


        switch (alphabet) {
            case "a":

                System.out.println("City Name is Ahmedabad ");
                break;

            case "b":
                System.out.println("City Name is Baroda ");
                break;

            case "c":
                System.out.println("City Name is Chandigadh ");
                break;

            case "d":
                System.out.println("City Name is Delhi ");
                break;

            case "e":

                System.out.println("City Name is Etava");


            case "f":

                System.out.println("City Name is Faridabad ");
                break;


            default:

                System.out.println("Alphabet is not valid");
        }
    }
}
