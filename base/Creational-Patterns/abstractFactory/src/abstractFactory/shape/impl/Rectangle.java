package abstractFactory.shape.impl;

import abstractFactory.shape.Shape;

/**
 *@description: 长方形类
 *@author:     yujunxin
 *@createTime: 2024/5/30 16:22
 *@version:    1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("打印出了一个长方形:");
    }
}
