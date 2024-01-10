package com.figure;

import java.util.Map;

public abstract class Figure {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public abstract String getCoordinate();


    public abstract double getArea();

}
