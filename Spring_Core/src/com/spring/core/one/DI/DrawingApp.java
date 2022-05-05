package com.spring.core.one.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String []args){
        //Triangle triangle = new Triangle();
        /*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");*/
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/two/collection/spring-config.xml");
        //Triangle triangle = (Triangle) context.getBean("triangle");
        Triangle triangle = (Triangle) context.getBean("triangle-alias");
        triangle.draw();
    }
}
