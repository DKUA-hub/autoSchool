package com.figure;

import java.util.Random;

public class Triangle extends Figure{
    final private String FIGURE_NAME = "triangle";
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(){
        setName(FIGURE_NAME);
        Random random = new Random();
        x1 = random.nextInt(21) - 10;
        y1 = random.nextInt(21) - 10;
        x2 = random.nextInt(21) - 10;
        y2 = random.nextInt(21) - 10;
        x3 = random.nextInt(21) - 10;
        y3 = random.nextInt(21) - 10;
    }

    public Triangle(int xA, int yA, int xB, int yB, int xC, int yC){
        setName(FIGURE_NAME);
        x1 = xA;
        y1 = yA;
        x2 = xB;
        y2 = yB;
        x3 = xB;
        y3 = yB;
    }
    @Override
    public String getCoordinate() {
        return String.format("(%d, %d), (%d, %d), (%d, %d)%n",
                x1, y1,
                x2, y2,
                x3, y3);
    }

    @Override
    public double getArea() {
        double area = 0.5 * Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return area;
    }
}
