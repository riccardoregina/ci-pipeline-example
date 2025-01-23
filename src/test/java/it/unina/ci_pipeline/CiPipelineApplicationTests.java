package it.unina.ci_pipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiPipelineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void ok() {
		Assertions.assertTrue(true);
	}

	@Test
	void fail() {
		Assertions.fail();
	}

}
