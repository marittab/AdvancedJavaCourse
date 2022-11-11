package Shapes;

public class Kite extends ICorneredShape{

    public Kite(Double diagonal1, Double diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public void getArea() {
        System.out.println("Area of kite: " + (diagonal1*diagonal2)/2);
    }
}
