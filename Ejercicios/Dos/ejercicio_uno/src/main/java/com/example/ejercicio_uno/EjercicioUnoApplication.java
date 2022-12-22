package com.example.ejercicio_uno;

import com.example.ejercicio_uno.entities.Saludo;
import com.example.ejercicio_uno.repositories.SaludoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioUnoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EjercicioUnoApplication.class, args);
		SaludoRepository repository = context.getBean(SaludoRepository.class);

		Saludo saludoEnMexico = new Saludo(null, "Hola", "México");
		Saludo saludoEnInglaterra = new Saludo(null, "Hello", "Inglaterra");
		Saludo saludoEnJapon = new Saludo(null, "こんにちは", "Japón");
		Saludo saludoEnAleman = new Saludo(null, "Hallo", "Alemania");

		repository.save(saludoEnMexico);
		repository.save(saludoEnInglaterra);
		repository.save(saludoEnJapon);
		repository.save(saludoEnAleman);

	}

}
