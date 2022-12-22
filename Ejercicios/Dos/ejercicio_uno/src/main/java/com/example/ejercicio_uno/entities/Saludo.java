package com.example.ejercicio_uno.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "saludos")
public class Saludo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String saludo;
    private String pais;

    public Saludo() {}

    public Saludo(Long id, String saludo, String pais) {
        this.id = id;
        this.saludo = saludo;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
