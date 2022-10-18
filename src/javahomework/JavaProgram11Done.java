package javahomework;
/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/

public class JavaProgram11Done {
    public static void main(String[] args) {
        JavaProgram11Done obj = new JavaProgram11Done();
        obj.myMethod();
    }
    public void myMethod() {
        System.out.println("enter number divided by 3");
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0) {
                System.out.println(i + ",");
            }
        System.out.println("enter number divided by 5:");
        for (int i = 1; i < 100; i++)
        if (i % 5 == 0)
            System.out.println(i +",");
        System.out.println("divided by 3 & 5:");
        for (int i = 1 ; i < 100; i++)
            if (i%3==0 && i%5==0)
                System.out.println(i + ",");
        }
    }
