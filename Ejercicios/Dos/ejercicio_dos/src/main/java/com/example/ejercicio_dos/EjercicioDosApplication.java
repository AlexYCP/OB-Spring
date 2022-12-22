package com.example.ejercicio_dos;

import com.example.ejercicio_dos.entities.Laptop;
import com.example.ejercicio_dos.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioDosApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EjercicioDosApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptopHP = new Laptop(null, "HP-Power", "HP");
		Laptop laptopHonor = new Laptop(null, "Honor-Magic", "Honor");

		repository.save(laptopHP);
		repository.save(laptopHonor);

	}

}
