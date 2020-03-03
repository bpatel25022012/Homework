package homework15022020;


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // declaration of variable
        double base;
        double height;
        double area;

        // creation of scanner

        Scanner scan = new Scanner(System.in);

        // calling variable through scanner

        System.out.println("Enter the value of base: "  );
        base = scan.nextInt();
        System.out.println("Enter the value of height: ");
        height = scan.nextInt();
        scan.close();
        // formula creation
        area = (base*height)/2;
        System.out.println("Area of Triangle is: " + area);



    }






}
