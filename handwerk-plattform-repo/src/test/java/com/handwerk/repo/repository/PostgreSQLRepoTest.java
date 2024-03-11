package com.handwerk.repo.repository;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
public class PostgreSQLRepoTest {

	@ServiceConnection
	private static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>("postgres:14-alpine")
			.withReuse(true);


	@DynamicPropertySource
	public static void overrideProps(DynamicPropertyRegistry registry) {
		registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
	}

	@BeforeAll
	public static void setUp() {
		postgreSQLContainer.start();
	}
}
