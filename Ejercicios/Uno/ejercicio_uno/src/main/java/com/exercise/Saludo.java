package com.exercise;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public Saludo() {}

    public String imprimirSaludo() {
        return "¡Hola, maestros!";
    }

}
