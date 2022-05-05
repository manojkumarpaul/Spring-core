package com.spring.core.nine.annotations;

import org.springframework.context.ApplicationContext;
public class Triangle implements Shape
{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext applicationContext;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
   public void draw(){
        System.out.println(getPointA().getX()+", "+getPointA().getY());
        System.out.println(getPointB().getX()+", "+getPointB().getY());
        System.out.println(getPointC().getX()+", "+getPointC().getY());
    }
}
