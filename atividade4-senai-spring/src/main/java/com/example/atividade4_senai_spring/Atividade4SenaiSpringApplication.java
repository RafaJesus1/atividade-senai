package com.example.atividade4_senai_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Atividade4SenaiSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(Atividade4SenaiSpringApplication.class, args);

		HelloWorld saudacoes = new HelloWorld();
		saudacoes.sayHello();
	}

}


