package com.swathy.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring.xml");
        Person per = (Person) context.getBean("pers");
        per.StartPump();
    }
}

class Person{
    private Heart heart;

    public void setHeart(Heart heart){
        this.heart=heart;
    }

    public void StartPump(){
        heart.pump();
    }
}

class Heart{
    public void pump(){
        System.out.println("Heart is Pumping...");
    }
}
