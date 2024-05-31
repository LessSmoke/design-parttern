package abstractFactory.factory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;
import abstractFactory.shape.impl.Circle;
import abstractFactory.shape.impl.Rectangle;
import abstractFactory.shape.impl.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
