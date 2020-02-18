package homework15022020;

import java.util.Scanner;

public class PatternOfJava {
    // declaration of main method
    public static void main(String[] args) {

    // declaration of scanner object
        Scanner scan = new Scanner(System.in);

    // calling  string through scanner
        System.out.println("Enter First Character :");
        String j = scan.next();
        j = j.toUpperCase();

        System.out.println("Enter Second Character :");
        String a = scan.next();
        a = a.toLowerCase();

        System.out.println("Enter Third Character :");
        String v = scan.next();
        v = v.toLowerCase();

        String V;
        V = v.toUpperCase();

        //creating object for string

        PatternOfJava obj = new PatternOfJava();
        obj.myPattern(j, a, v, V);

    }

    // declaration of instance method and printing statement
public void myPattern(String j , String a , String v , String V){
        System.out.println("     " + j +  "      "  + a + "     " + v + "      " + v + "  " + a + "  ");
        System.out.println("     " + j + "     " + a + " " + a + "     " + v + "    " + v  + "  " + a + " " + a + " ");
        System.out.println( j + "    " + j +  "    " + a + a + a + a + a + "     " + V + "  " + V + "  " + a + a + a + a + a + "  ");
        System.out.println("   "  + j + j + "    " + a + "     " + a + "     " + V + "   " + a + "     " + a);

    }
}
