package abstractFactory.color.impl;

import abstractFactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("当前填充的颜色为红色");
    }
}
