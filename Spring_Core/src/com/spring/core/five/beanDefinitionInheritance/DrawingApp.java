package com.spring.core.five.beanDefinitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();
    }
}
