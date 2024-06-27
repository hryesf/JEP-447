public class Rectangle extends Shape {
    private final double width;
    private final double height;


    public Rectangle(String color, double width, double height) {
        // first calls the constructor of the parent class, Shape, and then validates!
        if (width < 0 || height < 0) throw new IllegalArgumentException();
        super(color);
        this.width = width;
        this.height = height;
    }


    // using auxiliary method
    /*public Rectangle(String color, double width, double height) {
        super(validateParams(color, width, height));
        this.width = width;
        this.height = height;
    }

    private static String validateParams(String color, double width, double height) {
        if (width < 0 || height < 0) throw new IllegalArgumentException();
            return color;
    }*/
}
