package homework22022020;

import java.util.Scanner;

/*Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry*/

public class AlphabetAtoF8 {

    // declaration of main method
    public static void main(String[] args) {
        // declaration of variable
        String alphabet;
        // declaration of scanner
        Scanner scan = new Scanner(System.in);
        // calling variable through scanner
        System.out.println("Please enter any alphabet between a to f ");
        alphabet = scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();
        // using if/else if to call
        if (alphabet.equals("a")) {
            System.out.println("City Name is Ahmedabad ");

        } else if (alphabet.equals("b")) {
            System.out.println("City Name is Baroda ");

        } else if (alphabet.equals("c")) {
            System.out.println("City Name is Chandigadh ");

        } else if (alphabet.equals("d")) {
            System.out.println("City Name is Delhi ");

        } else if (alphabet.equals("e")) {
            System.out.println("City Name is Etava");

        } else if (alphabet.equals("f")) {
            System.out.println("City Name is Faridabad ");

        } else
            System.out.println("Alphabet is not valid");
    }
}