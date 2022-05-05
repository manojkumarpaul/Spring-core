package com.spring.core.three.autowire;

public class Triangle
{
    private Point pointA;
    private Point pointB;
    private Point pointC;

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
}
