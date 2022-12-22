package com.example.ejercicio_dos.controllers;

import com.example.ejercicio_dos.entities.Laptop;
import com.example.ejercicio_dos.repositories.LaptopRepository;
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

    /**
     * http://localhost:8080/ap7/laptops
     * @return
     */
    @GetMapping("/api/laptops")
    public List<Laptop> obtenerLaptops() {
        return laptopRepository.findAll();
    }

    /**
     * http://localhost:8080/ap7/laptops
     * @param id
     * @return
     */
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> obtenerIdentificador(@PathVariable Long id) {
        Optional<Laptop> laptopOptional = laptopRepository.findById(id);

        if (laptopOptional.isPresent()) {
            return ResponseEntity.ok(laptopOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * http://localhost:8080/ap7/laptops
     * @param laptop
     * @return
     */
    @PostMapping("/api/laptops")
    public Laptop crearLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

}
