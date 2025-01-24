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
	void test1() {
		//Arrange
		var date = LocalDate.of(2000, 1, 1);
		var t = new Transaction(2f, date);
		var repo = new TransactionRepository(new ArrayList<>());

		//Act
		repo.addTransaction(t);

		//Assert
		Assertions.assertTrue(repo.getTransactions(date, date).contains(t));
	}

	@Test
	void test2() {
		//Arrange
		var startdate = LocalDate.of(2000, 1, 1);
		var enddate = LocalDate.of(2000, 1, 30);
		var date = LocalDate.of(2000, 1, 15);
		var t = new Transaction(2f, date);
		var repo = new TransactionRepository(new ArrayList<>());

		//Act
		repo.addTransaction(t);

		//Assert
		Assertions.assertTrue(repo.getTransactions(startdate, enddate).contains(t));
	}

	@Test
	void test3() {
		//Arrange
		var startdate = LocalDate.of(2000, 3, 1);
		var enddate = LocalDate.of(2000, 3, 30);
		var date = LocalDate.of(2000, 1, 1);
		var t = new Transaction(2f, date);
		var repo = new TransactionRepository(new ArrayList<>());

		//Act
		repo.addTransaction(t);

		//Assert
		Assertions.assertFalse(repo.getTransactions(startdate, enddate).contains(t));
	}

}
