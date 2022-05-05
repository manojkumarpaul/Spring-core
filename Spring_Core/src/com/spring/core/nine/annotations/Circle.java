package com.spring.core.nine.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
    private Point pointThird;

    public Point getPointThird() {
        return pointThird;
    }

    @Required
    public void setPointThird(Point pointThird) {
        this.pointThird = pointThird;
    }

    @Override
    public void draw() {
        System.out.println("Circle center points : "+pointThird.getX()+", "+pointThird.getY());
    }
}
