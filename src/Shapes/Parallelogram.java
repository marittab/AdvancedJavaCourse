package Shapes;

public class Parallelogram extends ICorneredShape{

    public Parallelogram(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

        @Override
        public void getArea(){
            System.out.println("Area of Parallelogram: " + width * height);
        }


}
