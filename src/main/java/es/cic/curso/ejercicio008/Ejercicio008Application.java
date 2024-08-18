package es.cic.curso.ejercicio008;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Ejercicio008Application {
    public static void main(String[] args) {
        SpringApplication.run(Ejercicio008Application.class, args);
    }
}
