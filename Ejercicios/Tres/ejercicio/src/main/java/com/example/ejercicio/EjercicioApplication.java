package com.example.ejercicio;

import com.example.ejercicio.entities.Laptop;
import com.example.ejercicio.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EjercicioApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptopUno = new Laptop(null, "HP-Power", "HP");
		Laptop laptopDos = new Laptop(null, "Honor-Magic", "Honor");

		repository.save(laptopUno);
		repository.save(laptopDos);

	}
}
