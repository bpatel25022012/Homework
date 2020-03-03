package homework29022020;

import java.util.Scanner;

public class FibonacciNumbers9 {

    public static void main(String[] args)
    {
        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber;
        int previousNumber = 1;
        int nextNumber = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of Febonacci Series :");
        maxNumber=scan.nextInt();

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        scan.close();

    }
        }


