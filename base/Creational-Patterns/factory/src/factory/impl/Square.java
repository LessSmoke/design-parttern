package factory.impl;

import factory.factory.Shape;

/**
 *@description: 正方形
 *@author:     yujunxin
 *@createTime: 2024/5/30 16:24
 *@version:    1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("画出了一个正方形");
    }
}
