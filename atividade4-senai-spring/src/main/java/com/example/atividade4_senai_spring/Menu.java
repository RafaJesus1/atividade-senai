package com.example.atividade4_senai_spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private final List<Paciente> pacientes = new ArrayList<>();

    public String printMenu() {
        return "\n1 - Cadastrar paciente\n2 - Listar pacientes\n3 - Sair";
    }

    public void cadastrarPaciente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, idade, sexo, telefone);
        pacientes.add(paciente);

        System.out.println("✅ Paciente cadastrado com sucesso!");
    }

    public void listarPacientes() {
        int i = 0;
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("📋 Lista de pacientes:");
            for (Paciente p : pacientes) {
                i++;
                System.out.println("ID do paciente: " + i);
                System.out.println(p);
            }
        }
    }
}

