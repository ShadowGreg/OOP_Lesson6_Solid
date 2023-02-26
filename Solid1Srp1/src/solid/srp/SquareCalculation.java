package solid.srp;

public class SquareCalculation {

    private int side;
    public SquareCalculation(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
    public int getSide(){
        return side;
    }
}
