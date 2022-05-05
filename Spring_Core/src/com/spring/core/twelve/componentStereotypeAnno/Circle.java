package com.spring.core.twelve.componentStereotypeAnno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/*@Service
@Repository
@Controller*/
@Component
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource (name = "pointThird")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle center points : "+center.getX()+", "+center.getY());
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
