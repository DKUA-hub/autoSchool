package com.figure;

import java.util.Map;
import java.util.Random;

public class Square extends Figure{
    final private String FIGURE_NAME = "square";
    private int x1, y1, x2, y2;
    private int side;
    public Square(){
        setName(FIGURE_NAME);
        Random random = new Random();
        x1 = random.nextInt(21) - 10;
        y2 = random.nextInt(21) - 10;
        side = random.nextInt(10) + 1;
        setCoordinate();
    }

    public Square(int x, int y, int side){
        setName(FIGURE_NAME);
        x1 = x;
        y2 = y;
        this.side = side;
    }

    private void setCoordinate() {
        x2 = x1 + side;
        y1 = y2 - side;
    }

    @Override
    public String getCoordinate() {
        return String.format("(%d,%d), (%d,%d), (%d,%d), (%d,%d)",
                x1, y1,
                x1, y2,
                x2, y1,
                x2, y2);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
