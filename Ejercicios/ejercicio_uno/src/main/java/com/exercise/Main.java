package com.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("saludo");
        String obtenerSaludo = saludo.imprimirSaludo();

        System.out.println(obtenerSaludo);

    }

}
