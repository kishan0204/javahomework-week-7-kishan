package javahomework;

/*19. Write a Java program to calculate the average value of array elements.*/
public class JavaProgram19Done {
    public static void main(String[] args)
    {
        JavaProgram19Done obj = new JavaProgram19Done();
        obj.average();
    }
    public void average()
    {
        int[] array = {10,20,30,40,50,60};
        double ave;
        int length = array.length;
        int sum =0;

        for (int i = 0; i < array.length;i++)
        {
            sum+= array[i];
            {
                ave=sum/ length;
                System.out.println("average value of array elements" + ave);
            }
        }
    }
}
