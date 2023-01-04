package com.example.ejercicio.controllers;

import com.example.ejercicio.entities.Laptop;
import com.example.ejercicio.repositories.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptops")
    public List<Laptop> obtenerLaptops() {
        return laptopRepository.findAll();
    }

    @GetMapping("/laptops/{id}")
    public ResponseEntity<Laptop> obtenerIdentificador(@PathVariable Long id) {
        Optional<Laptop> laptopOptional = laptopRepository.findById(id);

        if (laptopOptional.isPresent()) {
            return ResponseEntity.ok(laptopOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/laptops")
    public Laptop crearLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @PutMapping("/laptops")
    public ResponseEntity<Laptop> actualizarLaptop(@RequestBody Laptop laptop) {
        if (laptop.getId() == null) {
            return ResponseEntity.badRequest().build();
        }

        if (!laptopRepository.existsById(laptop.getId())) {
            return ResponseEntity.notFound().build();
        }

        Laptop resultado = laptopRepository.save(laptop);
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/laptops/{id}")
    public ResponseEntity<Laptop> eliminarLaptop(@PathVariable Long id) {
        if (!laptopRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/laptops")
    public ResponseEntity<Laptop> eliminarTodo() {
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
