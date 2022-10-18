package javahomework;
/*1. Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)
*/
import java.util.Scanner;

public class JavaProgram1Done {
    String a = "even";

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = scanner.nextInt();
         if(num%2==0){
             System.out.println("Input number is even");
         }else{
             System.out.println("input number is odd");
             scanner.close();
         }
    }
}
