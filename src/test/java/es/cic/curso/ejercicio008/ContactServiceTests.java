package es.cic.curso.ejercicio008;

import org.junit.Test;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactServiceTests {

    private static final KafkaContainer kafkaContainer = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"));

    static {
        kafkaContainer.start();
    }

    @Test
    public void testKafkaContainer() {
        assertThat(kafkaContainer.isRunning()).isTrue();
    }
}