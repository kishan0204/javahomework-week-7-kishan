package javahomework;
/*Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.*/

public class JavaProgram15Done {

/*Write a class with the name Wall. The class needs two fields (instance variables) with name width
and height of type double.*/
    double width;
    double height;
    public void myMethod(double width , double height) {
        if (width < 0)
            width = 0;
        if (height < 0)
            height = 0;
        this.width = width;
        this.height = height;
    }
    public double getWidth () {
        return this.getHeight();
    }
    public double getHeight() {
        return this.height;
    }
    public double setwidht(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
        return this.width;
    }
    public double sethieght(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
        return this.height;
    }
    public double getAre(){
        final double area =this.width*this.height;
        return area;

        }


    }

