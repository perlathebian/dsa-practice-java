import java.util.ArrayList;

public class ShapeMain {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle("red", 3.5);
        Rectangle rectangle = new Rectangle("blue", 5.5, 10.7);
        shapes.add(circle);
        shapes.add(rectangle);

        for(Shape shape : shapes){
            shape.describe();
        }
    }
}
