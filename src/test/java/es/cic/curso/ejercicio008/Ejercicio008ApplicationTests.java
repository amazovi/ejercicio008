package es.cic.curso.ejercicio008;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Ejercicio008ApplicationTests {

	@Test
	void contextLoads() {
	}

}
