package abstractFactory;

import abstractFactory.color.Color;
import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.FactoryProducer;
import abstractFactory.shape.Shape;

public class Client {

    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");

        // 获取颜色工厂
        AbstractFactory color = FactoryProducer.getFactory("COLOR");

        // 生成一个红色的圆
        /*
            * 1. 获得圆形
            * 2. 填充颜色
         */

        // 获取圆形
        Shape circle = shape.getShape("CIRCLE");
        circle.draw();

        // 填充红色
        Color red = color.getColor("RED");
        red.fill();
    }
}
