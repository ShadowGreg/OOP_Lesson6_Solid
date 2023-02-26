package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareCalculation;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        int scale = 1;
        System.out.printf("Площадь фигуры: %d \n", new SquareCalculation(side).getArea());

        new SquareView(scale,side).draw();
    }
}
