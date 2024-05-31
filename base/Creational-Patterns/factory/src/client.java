import factory.factory.Shape;
import factory.factory.ShapeFactory;

public class client {
    public static void main(String[] args) {
        // 获得方形
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
