package homework22022020;

import java.util.Scanner;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+, >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in following format*/

public class GradeOfStudent3 {

    // declaration of main method
    public static void main(String[] args) {

        // declaration of scanner
        Scanner scan = new Scanner(System.in);

        // printing statement for input
        System.out.println("Please Enter Student Name: ");
        String name = scan.nextLine();

        // printing statement for input
        System.out.println("Please Enter Student's Roll No.: ");
        int rollno = scan.nextInt();

        // declaration of variables
        int maths;
        int science;
        int english;
        float total;
        double percentage;
        String grade = " ";
        String result;

        // printing statements of maraks variable with if condition

        System.out.println("Enter Marks for Maths :");
        maths = scan.nextInt();
        if (maths < 0 || maths > 100) {
            System.out.println("“Invalid Input, Marks\n" +
                    "should between 0 to 100”");
        }

        System.out.println("Enter Marks for Science :");
        science = scan.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("“Invalid Input, Marks\n" +
                    "should between 0 to 100”");
        }
        System.out.println("Enter Marks For English :");
        english = scan.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("“Invalid Input, Marks\n" +
                    "should between 0 to 100”");
        }

        // equation declaration for total and percentage with if condition for grade

        total = (maths + science + english);

        percentage = (total / 300) * 100;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";

        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";

        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        }
        if (percentage >= 35) {
            result = "Pass";
            System.out.println("Your Grade is :" + grade);
        } else {
            result = "Fail";
        }

        // printing statement for markshit

        System.out.println("You are " + result);
        System.out.println("____________________________________");
        System.out.println("|                                  |");
        System.out.println("|           Mark Sheet             |");
        System.out.println("|__________________________________|");
        System.out.println("|    Name    :     " + name + "         |");
        System.out.println("|    Roll No.:     " + rollno + "              |");
        System.out.println("|__________________________________|");
        System.out.println("|    Subject :      Marks          |");
        System.out.println("|__________________________________|");
        System.out.println("|    Maths      :     " + maths + "           |");
        System.out.println("|    Science    :     " + science + "           |");
        System.out.println("|    English    :     " + english + "           |");
        System.out.println("|__________________________________|");
        System.out.println("|    Total      :     " + total + "        |");
        System.out.println("|__________________________________|");
        System.out.println("|    Percentage :     " + percentage + "         |");
        System.out.println("|    Result     :     " + result + "         |");
        System.out.println("|    Grade      :      " + grade + "           |");
        System.out.println("|__________________________________|");

    }


}
