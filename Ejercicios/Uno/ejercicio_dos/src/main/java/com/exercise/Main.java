package com.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService us = (UserService) context.getBean("userService");

        System.out.println(us.notificationService.printNotificationService());

    }

}
