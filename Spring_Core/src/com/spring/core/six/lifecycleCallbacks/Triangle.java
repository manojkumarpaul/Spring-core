package com.spring.core.six.lifecycleCallbacks;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle /*implements InitializingBean, DisposableBean*/
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

    /*@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable bean destroy method");
    }*/

    public void myInit(){
        System.out.println("My Initializing Bean");
    }

    public void myDestroy(){
        System.out.println("My Disposable bean destroy method");
    }
}
