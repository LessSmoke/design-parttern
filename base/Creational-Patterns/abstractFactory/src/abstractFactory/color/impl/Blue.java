package abstractFactory.color.impl;

import abstractFactory.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充颜色为蓝色");
    }
}
