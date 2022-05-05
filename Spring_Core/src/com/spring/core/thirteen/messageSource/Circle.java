package com.spring.core.thirteen.messageSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {
    private Point center;

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource (name = "pointThird")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("circle.messages",
                new Object[]{center.getX(),center.getY()},
                "No Messages Found",
                null));
        //System.out.println("Circle center points : "+center.getX()+", "+center.getY());
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Called");
    }
}
