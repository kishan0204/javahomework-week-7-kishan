package javahomework;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?*/

import java.util.Scanner;

public class JavaProgram2Done {

    public static void main(String[] args) {


        int year;
        System.out.println("Enter year");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("find out if it is leap year");
        }else {
            System.out.println("find out if it is not leap year");

        }
    }


}

