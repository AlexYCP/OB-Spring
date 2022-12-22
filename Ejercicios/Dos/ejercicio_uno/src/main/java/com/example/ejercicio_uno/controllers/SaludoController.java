package com.example.ejercicio_uno.controllers;

import com.example.ejercicio_uno.entities.Saludo;
import com.example.ejercicio_uno.repositories.SaludoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SaludoController {

    private SaludoRepository saludoRepository;

    public SaludoController(SaludoRepository saludoRepository) {
        this.saludoRepository = saludoRepository;
    }

    /**
     * http://localhost:8080/api/saludos
     * @return
     */
    @GetMapping("/api/saludos")
    public List<Saludo> obtenerSaludos() {
        return saludoRepository.findAll();
    }

    /**
     * http://localhost:8080/api/saludos/id
     * @param id
     * @return
     */
    @GetMapping("/api/saludos/{id}")
    public ResponseEntity<Saludo> obtenerIdentificador(@PathVariable long id) {
        Optional<Saludo> saludoOptional = saludoRepository.findById(id);

        if (saludoOptional.isPresent()) {
            return ResponseEntity.ok(saludoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * http://localhost:8080/api/saludos/id
     * @param saludo
     * @return
     */
    @PostMapping("/api/saludos")
    public Saludo crearSaludo(@RequestBody Saludo saludo) {
        return saludoRepository.save(saludo);
    }

}
