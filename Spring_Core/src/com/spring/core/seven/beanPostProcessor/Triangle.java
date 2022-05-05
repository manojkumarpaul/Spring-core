package com.spring.core.seven.beanPostProcessor;

import org.springframework.context.ApplicationContext;

public class Triangle
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

   public void draw(){
        System.out.println(getPointA().getX()+", "+getPointA().getY());
        System.out.println(getPointB().getX()+", "+getPointB().getY());
        System.out.println(getPointC().getX()+", "+getPointC().getY());
    }

    public void myInit(){
        System.out.println("My Initializing Bean");
    }

    public void myDestroy(){
        System.out.println("My Disposable bean destroy method");
    }
}
