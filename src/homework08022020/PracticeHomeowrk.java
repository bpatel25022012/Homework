package homework08022020;


import java.util.Scanner;

public class PracticeHomeowrk {
    int a;
    double b;
    String c;

    double f;

    public void tiger() {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please Enter Your Name : ");
        c = scan.next();

        System.out.println("Please Enter Your Age : ");
        a = scan.nextInt();

        System.out.println("Please Enter Your Income :");
        b = scan.nextDouble();


        f = a*b;
        System.out.println("Your Total Income for the life is :" +(f));
    }

    public static void main(String [] args){

        PracticeHomeowrk obj2 = new PracticeHomeowrk();
        obj2.tiger();






    }
}
