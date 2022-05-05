package com.spring.core.ten.autowiredanno;

import com.spring.core.nine.annotations.Triangle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){

            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            Shape shape = (Circle) context.getBean("circle");
            shape.draw();

    }
}
