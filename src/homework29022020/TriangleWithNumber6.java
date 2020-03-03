package homework29022020;

import java.util.Scanner;
/*
Write a program in Java to display the pattern like
triangle with a number
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567

12345678
123456789
12345678910
*/

public class TriangleWithNumber6 { // class

    public static void main(String[] args) // main method

    {
        int i,j,n; // cariable
        System.out.print("Input number of rows : "); // printing statement
        Scanner in = new Scanner(System.in); // scanner class
        n = in.nextInt();

        for(i=1;i<=n;i++) // for loop
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}

