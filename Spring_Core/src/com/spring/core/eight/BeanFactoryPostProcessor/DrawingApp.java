package com.spring.core.eight.BeanFactoryPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();

        Triangle triangle1 = (Triangle) context.getBean("triangle-alias");
        triangle1.draw();
    }
}
