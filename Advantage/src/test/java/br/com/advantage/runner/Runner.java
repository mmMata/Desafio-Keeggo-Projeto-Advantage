package br.com.advantage.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

    @RunWith(Cucumber.class)
	@CucumberOptions(features = "classpath:features/consultarAdicionar/consultarAdicionar.feature",
	tags="@adicionaritem",
	glue = "br.com.advantage.steps")
    

	public class Runner {

	}


