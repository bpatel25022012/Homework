package homework22022020;
//this programme is to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class Divided3And5_11 {

        // declaration of main method
    public static void main(String[] args) {

        // printing statement with for loop condition

        System.out.println("\nDivided By 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }

        System.out.println("\nDivided By 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");

        }

    }
}