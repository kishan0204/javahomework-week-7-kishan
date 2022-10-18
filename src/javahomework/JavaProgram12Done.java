package javahomework;


import java.util.Scanner;

/*12. Write a program that tells us input value is number or an alphabet or symbol.*/
public class JavaProgram12Done {
    public static void main(String[] args) {
        JavaProgram12Done obj = new JavaProgram12Done();
        obj.myMethod();
    }
    public void myMethod()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        char kk;
        kk=scanner.next().charAt(0);
        if( (kk>='A'  && kk<='Z')||(kk>='a'  && kk<='z')) {
            System.out.println("alphabet");
        }else if (kk>='0' && kk<='9') {
            System.out.println("number");
        }else
        {
            System.out.println("symbol");

        }
    }
}


