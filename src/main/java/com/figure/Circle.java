package com.figure;

import java.util.Random;

public class Circle extends Figure{

    final private String FIGURE_NAME = "circle";
    private int radius;
    private int x;
    private int y;

    public Circle(){
        setName(FIGURE_NAME);
        Random random = new Random();
        x = random.nextInt(21) - 10;
        y = random.nextInt(21) - 10;
        radius = random.nextInt(10) + 1;
    }

    public Circle(int x, int y, int radius){
        setName(FIGURE_NAME);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public String getCoordinate() {
        return String.format("(%d,%d)", x, y);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
}
