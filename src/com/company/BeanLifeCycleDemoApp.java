package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("trackCoach", Coach.class);

        //print out the result

        System.out.println(theCoach.getDailyFortune());


        context.close();
    }
}
