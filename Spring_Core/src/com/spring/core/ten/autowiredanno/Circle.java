package com.spring.core.ten.autowiredanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Required
    @Qualifier("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle center points : "+center.getX()+", "+center.getY());
    }
}
