package com.spring.core.fourteen.eventHandling;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            context.registerShutdownHook();
            Shape shape = (Circle) context.getBean("circle");
            System.out.println(context.getMessage("circle.getwish",null,
                    "This is default message", null));
            shape.draw();
    }
}