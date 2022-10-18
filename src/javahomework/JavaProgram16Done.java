package javahomework;
/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/

import java.util.Scanner;

public class JavaProgram16Done {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        if(number>0)
            if (number>0)
            {
                System.out.println(number+"positive number");
            } else if (number>0) {
                System.out.println(number + "nagative number");
            }else
            {
                System.out.println(number+"is neither positive or negative");
            }


    }
}