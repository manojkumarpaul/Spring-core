package com.spring.core.eleven.jsr250anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            context.registerShutdownHook();
            Shape shape = (Circle) context.getBean("circle");
            shape.draw();
    }
}