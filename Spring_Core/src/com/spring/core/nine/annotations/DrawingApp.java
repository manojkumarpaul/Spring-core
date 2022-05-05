package com.spring.core.nine.annotations;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            Shape shape = (Triangle) context.getBean("triangle-alias");
            shape.draw();

            shape = (Circle) context.getBean("circle");
            shape.draw();
        } catch (BeansException e) {
            System.out.println("There is an error:: "+e);
        }
    }
}
