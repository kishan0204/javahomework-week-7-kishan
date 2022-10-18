package javahomework;
/*18. Write a Java program to sum values of an array.*/
public class JavaProgram18Done {
    public static void main(String[] args) {
        int a[]= {10,20,30,100,};
        int sum = 0;
        for(int i : a)
        {
            sum=sum+i;

        }
        System.out.println("sum values of an array:"+sum);
    }
}
