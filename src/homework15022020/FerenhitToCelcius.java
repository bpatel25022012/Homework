package homework15022020;

import java.util.Scanner;

public class FerenhitToCelcius {

    public static void main(String[] args) {

        float Temprature; // data type variable

        Scanner scan = new Scanner(System.in); // creating scanner object

        System.out.println("Enter Temperature in Ferenhit"); // printing statment for ferenhit

        Temprature = scan.nextInt(); // using scanner calling temprature
        scan.close();
       Temprature = ((Temprature - 32 )* 5/9); // using formula for temprature

        System.out.println("Temprature in Celcius :" + Temprature); // calling statement for celcius
    }
}

