package javahomework;

import java.util.Scanner;

/*Same as above program-8 using switch statement.*/
public class JavaProgram9Done {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet from 'A' to 'f':");
        char city ;
        System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
        city = scanner.next().charAt(0);

        switch (city)
        {
            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Canada");
                break;
            case 'D':
                    System.out.println("Denmark");
                    break;
            case 'E':
                System.out.println("England");
                break;
            case 'F':
                System.out.println("France");
            default:
            System.out.print("Anyother Cityname Is Doesnot Exists");



        }


    }
}
