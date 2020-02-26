package homework22022020;

import java.util.Scanner;

//Write a java program that tell us that Input number is odd or even?
//HINT: use turnery operator (? :)

public class OddsEvensTurnery1 {

    // declaration of main method

    public static void main(String[] args) {
        OddsEvensTurnery1 obj = new OddsEvensTurnery1();
        obj.oddsevensturnery();

    }

    // declaration of user defined method

    public void oddsevensturnery() {

        // declaration of variable

        int a;

        // declaration of scanner

        Scanner scan = new Scanner(System.in);

        // print statement
        System.out.println("Please Enter any Number to check if its Odds or Evens");

        // calling variable through scanner

        a = scan.nextInt();

        // turnery operator

        String b = (a % 2 == 0) ? "even" : "odd";

        // print statement
        System.out.println(+a + " " + "is" + " " + b);
    }

}

