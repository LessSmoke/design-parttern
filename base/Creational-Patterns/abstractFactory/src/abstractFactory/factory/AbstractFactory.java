package abstractFactory.factory;

import abstractFactory.color.Color;
import abstractFactory.shape.Shape;

/**
 *@description: 抽象工厂类
 *@author:     yujunxin
 *@createTime: 2024/5/30 16:30
 *@version:    1.0
 */
public abstract class AbstractFactory {
    /** 获取颜色抽象方法*/
    public abstract Color getColor(String color);

    /** 获取形状抽象方法*/
    public abstract Shape getShape(String shape);
}
