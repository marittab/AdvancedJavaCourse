package Shapes;

public class Shapes {
    public static void main(String[] args) {
        Square mySquare = new Square(5.0);

        Rectangle myRectangle = new Rectangle(7.8, 3.5);

        Parallelogram myParallelogram = new Parallelogram(6.0, 3.3);

        Rhombus myRhombus = new Rhombus(2.2, 3.4);

        Circle myCircle = new Circle (2.0,Math.PI);

        Triangle myTriangle = new Triangle (4.2);

        Cylinder myCylinder = new Cylinder (2.0,6.0);

        Kite myKite = new Kite (2.9, 3.1);


        mySquare.getArea();
        myRectangle.getArea();
        myParallelogram.getArea();
        myRhombus.getArea();
        myCircle.getArea();
        myTriangle.getArea();
        myCylinder.getArea();
        myKite.getArea();
    }
}
