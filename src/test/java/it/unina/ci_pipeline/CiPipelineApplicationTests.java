package it.unina.ci_pipeline;

import it.unina.ci_pipeline.domain.Transaction;
import it.unina.ci_pipeline.domain.TransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootTest
class CiPipelineApplicationTests {

	@Test
	void contextLoads() {
		/*
		 * This tests that the Spring Boot application
		 * context starts up correctly.
		 */
	}

	@Test
	void test() {
		//Arrange
		var date = LocalDate.of(2000, 1, 1);
		var t = new Transaction(2f, date);
		var repo = new TransactionRepository(new ArrayList<>());

		//Act
		repo.addTransaction(t);

		//Assert
		Assertions.assertTrue(repo.getTransactions(date, date).contains(t));
	}

}
