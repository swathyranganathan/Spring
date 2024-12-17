package com.swathy.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");
        Human obj = (Human) context.getBean("humu");
        System.out.println(obj.age);


    }
}

class Human{
    Phone pho;
    public int age;
    public Human(int age, Phone pho){
        System.out.println("Constructor called");
        this.age= age;
        this.pho=pho;
        pho.ring();

    }

}
class Phone{
    public void ring(){
        System.out.println("Ringing...");
    }

}
