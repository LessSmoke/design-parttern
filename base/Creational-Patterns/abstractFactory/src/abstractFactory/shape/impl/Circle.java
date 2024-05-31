package abstractFactory.shape.impl;

import abstractFactory.shape.Shape;

/**
 *@description: 圆形
 *@author:     yujunxin
 *@createTime: 2024/5/30 16:25
 *@version:    1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("这里画出了一个圆形: ");
    }
}
