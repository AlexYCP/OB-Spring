package com.example.ejercicio_uno.repositories;

import com.example.ejercicio_uno.entities.Saludo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaludoRepository extends JpaRepository<Saludo, Long> {
}
