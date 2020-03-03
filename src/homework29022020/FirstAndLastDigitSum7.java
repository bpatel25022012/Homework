package homework29022020;
// write a method which do first and last Digit sum of any integer entered by user


public class FirstAndLastDigitSum7 { // class

    public static void main(String[] args) { // main method
        System.out.println(sumFirstLast(257)); // printing statement
    }
    public static int sumFirstLast(int number){ // static method with one parameter
        // number = 12 should output 3
        int num = number;
        if(num < 0){// if condition
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){ // while loop
            num = number / 100;
        }
        int firstDigit = num ;
        return firstDigit + lastDigit;
    }

}
