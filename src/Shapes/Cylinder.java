package Shapes;

public class Cylinder extends IRoundedShape{

public Cylinder (Double radius, Double height){
    this.radius = radius;
    this.height = height;
}
@Override
    public void getArea(){
    System.out.println(" Area of Cylinder: " + (2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius,2)));
}
}
