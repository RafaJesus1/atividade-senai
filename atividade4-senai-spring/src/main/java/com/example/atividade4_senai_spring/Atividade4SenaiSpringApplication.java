package com.example.atividade4_senai_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atividade4SenaiSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(Atividade4SenaiSpringApplication.class, args);

		Usuario funcionario = new Usuario();
		Menu menu = new Menu();

		funcionario.setNome("Rafael");

		System.out.println("Bem-vindo ao Sistema de Consultas, " + funcionario.getNome() + menu.printMenu());

		while (true) {
			menu.cadastrarPaciente();
			menu.listarPacientes();
		}





	}

}


