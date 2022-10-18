package javahomework;

import java.util.Scanner;

//Number of Days In Month
public class JavaProgram4Done {

    public static void main(String[] args) {
        int DayInMonth = 0;
        String NameOfMonth = "Unknow";
        Scanner scanner = new Scanner(System.in);
        System.out.println("name year");
        int year = scanner.nextInt();
        System.out.println("Day in Month");
        int month = scanner.nextInt();


        switch (month) {
            case 1:
                DayInMonth = 31;
                NameOfMonth = " January";
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DayInMonth = 29;
                } else {
                    DayInMonth = 28;
                }                /*every for year 29 days*/
                NameOfMonth = " February";
                break;
            case 3:
                DayInMonth = 31;
                NameOfMonth = " March";
                break;
            case 4:
                DayInMonth = 30;
                NameOfMonth = "April";
                break;
            case 5:
                DayInMonth = 31;
                NameOfMonth = "May";
                break;
            case 6:
                DayInMonth = 30;
                NameOfMonth = "June";
                break;
            case 7:
                DayInMonth = 31;
                NameOfMonth = "July";
                break;
            case 8:
                DayInMonth = 31;
                NameOfMonth = "August";
                break;
            case 9:
                DayInMonth = 30;
                NameOfMonth = "september";
                break;
            case 10:
                DayInMonth = 31;
                NameOfMonth = "October";
                break;
            case 11:
                DayInMonth = 30;
                NameOfMonth = "November";
                break;
            case 12:
                DayInMonth = 31;
                NameOfMonth = "December";
        }

                System.out.print(NameOfMonth+ " "+   year  +  " has  "  +DayInMonth + " day\n" );


        }

    }

