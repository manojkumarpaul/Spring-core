package com.spring.core.four.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware
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

    /*private String type;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    Triangle(String type){
        this.type = type;
    }

    Triangle(String type, int height){
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }*/

    /*public void setType(String type) {
        this.type = type;
    }*/


    public void draw(){
        //System.out.println(getType() + " Triangle drawn with height "+ getHeight());
        System.out.println(getPointA().getX()+", "+getPointA().getY());
        System.out.println(getPointB().getX()+", "+getPointB().getY());
        System.out.println(getPointC().getX()+", "+getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        pointA = (Point) applicationContext.getBean("pointA");
        System.out.println("Triangle Class: "+pointA.getX()+ ", " + pointA.getY());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName: "+name);
    }
}
