package com.makara.school;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game{

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Sit Down");
    }
    public void left(){
        System.out.println("Turn left");
    }
    public void right(){
        System.out.println("Turn right");
    }

}
