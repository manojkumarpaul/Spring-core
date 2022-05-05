package com.spring.core.eleven.jsr250anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource (name = "pointThird")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle center points : "+center.getX()+", "+center.getY());
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Called");
    }
}
