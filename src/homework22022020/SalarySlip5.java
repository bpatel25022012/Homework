package homework22022020;

import java.util.Scanner;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

public class SalarySlip5 {
    // declaration of main method and calling user define method into it

    public static void main(String[] args) {
        SalarySlip5 obj = new SalarySlip5();
       obj.salaryslip();




    }
    // user define method
    public  void salaryslip(){

    // declaration of variable

    int basicsalary;
    int hra;
    int ta;
    int da;
    int pf;

    // declaration of scanner and print statement
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Employee Id : ");
       int eId = scan.nextInt();

        System.out.println("Please Enter Employee Name : ");
        String eName = scan.next();

        System.out.println("Please Enter Basic Salary : ");
        basicsalary = scan.nextInt();

        // declaration of variable with input of basic salary varible
        hra = (basicsalary*10)/100;
        ta = (basicsalary*8)/100;
        da = (basicsalary*9)/100;
        pf = (basicsalary*20)/100;

        // working of gross salaray
        double grosssalary= (basicsalary+hra+ta+da)-pf;

        // printing statement
        System.out.println("______________________________________");
        System.out.println("|              Salary Slip           |");
        System.out.println("| ___________________________________|");
        System.out.println("| Employee Id         :  "+eId+"          |  ");
        System.out.println("| Employee Name       :  "+eName+"     |  ");
        System.out.println("|____________________________________|  ");
        System.out.println("| Basic Salary        :  "+basicsalary+"        | ");
        System.out.println("| HRA 10%             :  "+hra+"         | ");
        System.out.println("| TA 8%               :  "+ta+"         | ");
        System.out.println("| DA 9%               :  "+da+"         |"     );
        System.out.println("| PF 20%              :  "+pf+"         |");
        System.out.println("|____________________________________|");
        System.out.println("| Gross Salary        : " +grosssalary+"       |" );
        System.out.println("|====================================|");

    }
}

