package com.swathy.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("prototype.xml");
        Alpa obj1 = (Alpa) context.getBean("alopa");
        obj1.age=65;
        System.out.println(obj1.age);
        obj1.statement();

//    try this without mentioning scope="prototype" , Constructor will printeed one time and it both has same age of 65
//        Alpa obj2 = (Alpa) context.getBean("alopa");
//        System.out.println(obj2.age);
//        obj2.statement();

        Alpa obj2 = (Alpa) context.getBean("alopa");
        System.out.println(obj2.age);
        obj2.statement();

        Alpa obj3 = (Alpa) context.getBean("alopa");
        obj3.age=45;
        System.out.println(obj3.age);
        obj3.statement();


    }
}

class Alpa{
    public int age;
    private Alpa(){
        System.out.println("Constructor");
    }


    public void statement(){
        System.out.println("I am Alpa");
    }
}
