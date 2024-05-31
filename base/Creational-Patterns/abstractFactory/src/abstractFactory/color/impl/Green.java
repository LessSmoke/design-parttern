package abstractFactory.color.impl;

import abstractFactory.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充颜色为绿色");
    }
}
