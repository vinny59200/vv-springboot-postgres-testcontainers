package com.vv.testcontainerpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestContainerPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestContainerPostgresApplication::main).with(TestTestContainerPostgresApplication.class).run(args);
	}

}
