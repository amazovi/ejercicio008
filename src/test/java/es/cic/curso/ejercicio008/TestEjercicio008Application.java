package es.cic.curso.ejercicio008;

import org.springframework.boot.SpringApplication;

public class TestEjercicio008Application {

	public static void main(String[] args) {
		SpringApplication.from(Ejercicio008Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
