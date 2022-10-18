package javahomework;

import java.util.Scanner;

/*Write a Java program to test if an array contains a specific value.*/
public class JavaProgram20Done {
    public static void main(String[] args) {
        JavaProgram20Done obj = new JavaProgram20Done();
        obj.myMethod();
    }
    public void myMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int a[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int num;
        num=scanner.nextInt();
        for (int i = 0; i< a.length;i++){
            if(num==a[i]) {
                System.out.println("array contains");
            }
            else {
                System.out.println("arrayis not contains ");
            }
        };


    }
}
