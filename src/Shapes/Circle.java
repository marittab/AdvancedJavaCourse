package Shapes;

public class Circle extends IRoundedShape{

    public Circle (Double radius, Double pi){
        this.radius = radius;


    }
    @Override
    public void getArea(){
        System.out.println("Area of Circle: " + Math.PI*(Math.pow(radius, 2)));
    }
}
