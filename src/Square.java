public class Square extends Rectangle {

    public Square(String color, int area) {
        double a = Math.sqrt(area);
        super(color, a, a);
    }

    // To avoid calculating the square root of the area twice ==> auxiliary constructor
    /*public Square(String color, int area) {
        this(color, Math.sqrt(area));
    }

    private Square(String color, double sideLength) {
        super(color, sideLength, sideLength);
    }*/

}
