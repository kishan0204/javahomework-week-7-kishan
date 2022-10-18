package javahomework;

import java.util.Scanner;
/*5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF*/

public class JavaProgram5Done {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the Employee ID   :  ");
        int Employee = scanner.nextInt();
        System.out.println(" Enter the Employee Name :");
        String EmployeeName = scanner.next();
        System.out.println("Enter the Basic Salary");
        int BasicSalary = scanner.nextInt();


        System.out.println("|------------------------------------|");
        System.out.println("|             Salary Slip            |");
        System.out.println("|------------------------------------|");
        System.out.println("|Employee ID          : " + Employee + "          |");
        System.out.println("|Employee Name        : " + EmployeeName + "           |");
        System.out.println("|____________________________________|");
        System.out.println("|Basic Salary         : " + BasicSalary + "        |");
        System.out.println("|HRA 10%              :              |");
        System.out.println("|TA 8%                :              |");
        System.out.println("|DA 9%                :              |");
        System.out.println("|PE -20%              :              |");
        System.out.println("|_________________________________ __|");
        System.out.println("|Gross Salary         :              |");
        System.out.println("|____________________________________|");


    }

}

