package homework29022020;

import java.lang.String;

public class SharedDigit13 {



        public static void main(String[] args) {
            System.out.println(hasSharedDigit(17 , 53));

        }

        public static boolean hasSharedDigit(int number1, int number2) {

            if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
                return false;
            }

            int firstNumSecondDigit = number1 % 10;
            int firstNumFirstDigit = number1 / 10;
            int secondNumSecondDigit = number2 % 10;
            int secondNumFirstDigit = number2 / 10;

            if ((firstNumFirstDigit == secondNumFirstDigit) ||
                    (firstNumFirstDigit == secondNumSecondDigit) ||
                    (firstNumSecondDigit == secondNumFirstDigit) ||
                    (firstNumSecondDigit == secondNumSecondDigit)) {
                return true;
            }

            return false;
        }

}
