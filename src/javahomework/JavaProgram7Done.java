package javahomework;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class JavaProgram7Done {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sales id :");
        int sale = scanner.nextInt();
        System.out.println("enter seller's name");
        String name = scanner.next();
        ;
        System.out.println("enter sales amount");
        int salesAmount = scanner.nextInt();
        System.out.println("enter salary basic");
        int salaryBasic = scanner.nextInt();
        int commission;
        if (salesAmount >= 30000 && salesAmount >= 50000) {
            System.out.println("commission " + salesAmount * 35 / 100);
        } else if (salesAmount >= 20000 && salesAmount <= 30000) {
            System.out.println("commission " + salesAmount * 20 / 100);
        } else if (salesAmount >= 10000 && salesAmount <= 20000) {
            System.out.println("commission " + salesAmount * 10 / 100);
        } else if (salesAmount >= 10000) {
            System.out.println("commission " + salesAmount * 5 / 100);
        } else {
            System.out.println("commision " + salesAmount * 2 / 100);

        }

    }
}

