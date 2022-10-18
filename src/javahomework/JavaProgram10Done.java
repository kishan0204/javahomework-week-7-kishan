package javahomework;

import java.util.Scanner;

/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
public class JavaProgram10Done {
    public static void main(String[] args) {
        JavaProgram10Done obj = new JavaProgram10Done();
        obj.symbol();
        obj.method();
    }

    public void symbol() {
        System.out.println("select operator: + , - , * , / ,");
        System.out.println("enter operator");
    }

    public void method() {
        Scanner scanner = new Scanner(System.in);
        int a, b, res;
        char kk;
        kk = scanner.next().charAt(0);
        System.out.println("enter value of a:");
        a = scanner.nextInt();
        System.out.println("enter value of b");
        b = scanner.nextInt();
        if (kk == '+') {
            System.out.println(a + b);
        } else if (kk == '-') {
            System.out.println(a - b);
        } else if (kk == '*') {
            System.out.println(a * b);

        } else if (kk == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("");
        }
    }
}


