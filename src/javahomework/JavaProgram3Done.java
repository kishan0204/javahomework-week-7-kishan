package javahomework;

import java.util.Scanner;

public class JavaProgram3Done {/*3. Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name ");
        String name = scanner.next();
        System.out.println("enter rollnumber");
        int rollnum = scanner.nextInt();
        System.out.println("enter Math marks");
        int Math = scanner.nextInt();
        System.out.println("enter Science marks");
        int Science = scanner.nextInt();
        System.out.println("enter English marks");
        int English = scanner.nextInt();
        int Total = Math + Science + English;
        System.out.println(Total);
        float per = ((Total*100 / 300) );
        System.out.println(per);
        {

            if (per >= 80) {
                System.out.println("grade A+");
            } else if (per > 60) {
                System.out.println("grade A");
            } else if (per > 50) {
                System.out.println("grade B");
            } else if (per > 35) {
                System.out.println("grade C");
            } else {
                System.out.println("fail");


            }


            System.out.println("|___________________________________|");
            System.out.println("|              Mark Sheet           |");
            System.out.println("|___________________________________|");
            System.out.println("|Enter name     :        " + name + "  |");
            System.out.println("|Roll No :                   " + rollnum + "  |");
            System.out.println("|___________________________________|");
            System.out.println("|Subject         :     Marks         |");
            System.out.println("|Math            :    " + Math + "            |");
            System.out.println("|Science         :     " + Science + "           |");
            System.out.println("|English         :      " + English + "           |");
            System.out.println("|___________________________________|");
            System.out.println("|Total          :      " + Total + "         |");
            System.out.println("|Percentage     :         " + per + "       |");
            System.out.println("|Result         :             |");
            System.out.println("|Grade          :              |");
            System.out.println("|___________________________________|");


        }
    }
}
//        int z = a + b + f + g;
//        String x = "";
//        double y = z / 300.0 * 100.00;
//
//
//        System.out.println(" total = " + z);
//
//    }
//}
///*int marks =55;
//        if(marks>=80) {
//            System.out.println("Distinction");
//        }else if (marks<80 && marks>=70) {
//            System.out.println("Grade A");
//        }else if (marks<70 && marks>=50) {
//            System.out.println("Grade B");
//        }else{
//            System.out.println("pass");
//
//        }
//        System.out.println("Thank you");
//    }
