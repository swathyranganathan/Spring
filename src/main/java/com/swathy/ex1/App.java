package com.swathy.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // this line create a container
        Alien obj = (Alien) context.getBean("alien");
        System.out.println(obj.getAge());
        obj.code();

    }
}

class Alien{
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Object created");
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }
}

class Laptop{
    public Laptop(){
        System.out.println("Laptop Object Created");
    }
    public void compile(){
        System.out.println("compiling...");
    }
}


/*This is the main class where the Spring application starts. The important parts:

ApplicationContext: This is the IoC container provided by Spring. It is responsible for managing beans (objects) defined in the Spring configuration file (spring.xml).
ClassPathXmlApplicationContext: This class loads the spring.xml file, which contains the bean definitions.
context.getBean("alien"): This line retrieves an instance of the Alien class from the Spring container. The object is created and managed by Spring.
obj.code();: This calls the method code() on the Alien object.
*/

/*Backend Process: How It Works
Step 1: Spring Container (IoC)
IoC (Inversion of Control): Normally, you create objects manually using new Alien(). In Spring, the container takes control of creating and managing objects for you. This is called Inversion of Control.
Spring Container: The ApplicationContext is the core of Spring. It reads the spring.xml file, initializes all the beans defined in it, and manages their lifecycle.
Step 2: Bean Creation
When ClassPathXmlApplicationContext is initialized, Spring reads the spring.xml file and:
Finds the <bean> tag with id="alien".
Loads the Alien class using its fully qualified name com.swathy.ex1.Alien.
Creates an object of Alien and keeps it in memory, ready to be used.
Step 3: Retrieving and Using the Bean
The context.getBean("alien") retrieves the object created by Spring. Since Spring already created the object, you don’t need to manually instantiate it.
After retrieving the object, you call its method using obj.code();.
*/