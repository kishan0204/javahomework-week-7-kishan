package javahomework;

import java.util.Scanner;

public class JavaProgram8Done {
    /*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet from 'A' to 'f':");
        char city = scanner.next().charAt(0);
        if (city=='A'){
            System.out.println("America");
        } else if (city=='B') {
            System.out.println("Bath");
        } else if (city=='C') {
            System.out.println("Canada");
        } else if (city=='D') {
            System.out.println("Denmark");
        } else if (city=='E') {
            System.out.println("England");
        } else if (city=='F') {
            System.out.println("France");
        }else
     System.out.print("Anyother Cityname Is Doesnot Exists");
}
}


