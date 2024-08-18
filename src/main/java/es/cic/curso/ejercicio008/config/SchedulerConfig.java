package es.cic.curso.ejercicio008.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerConfig {

    @Scheduled(fixedRate = 60000) // Ejecuta cada minuto
    public void performScheduledTask() {
        System.out.println("Tarea programada ejecutada cada minuto.");
    }
}
