package Shapes;

public class Rhombus extends ICorneredShape{

    public Rhombus (Double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void getArea(){
        System.out.println("Area of Rhombus: " + length * height);
    }

}
