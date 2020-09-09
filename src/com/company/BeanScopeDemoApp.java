package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("trackCoach", Coach.class);
        Coach alphaCoach = context.getBean("trackCoach", Coach.class);

        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach alphaBaseballCoach = context.getBean("baseballCoach", Coach.class);

        // check if they are the same
        boolean result = theCoach == alphaCoach;
        boolean baseballResult = baseballCoach==alphaBaseballCoach;

        //print out the result
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for theCouch: " + theCoach);
        System.out.println("Memory location for alphaCouch: " + alphaCoach);

        System.out.println("Pointing to the same object: " + baseballResult);
        System.out.println("Memory location for theCouch: " + baseballCoach);
        System.out.println("Memory location for alphaCouch: " + alphaBaseballCoach);

        context.close();
    }
}
