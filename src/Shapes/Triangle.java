package Shapes;

public class Triangle extends ICorneredShape {

    public Triangle(Double width) {
        this.width = width;
    }
      @Override
      public void getArea(){
            System.out.println("The area of Triangle:" + 0.25*Math.sqrt(3)*Math.pow(width, 2));

    }

}
