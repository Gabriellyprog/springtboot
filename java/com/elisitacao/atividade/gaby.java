package com.elisitacao.atividade;

import java.util.Scanner;

public class gaby {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de funcionários: ");
	        int numeroFuncionarios = scanner.nextInt();

	        if (numeroFuncionarios <= 0) {
	            System.out.println("Número de funcionários deve ser maior que zero.");
	            scanner.close();
	            return;
	        }

	        double somaSalarios = 0;

	        for (int i = 1; i <= numeroFuncionarios; i++) {
	            System.out.print("Digite o salário do funcionário " + i + ": ");
	            double salario = scanner.nextDouble();
	            somaSalarios += salario;
	        }

	        double mediaSalarial = somaSalarios / numeroFuncionarios;

	        System.out.printf("A média salarial da empresa é: %.2f\n", mediaSalarial);

	      
	        scanner.close();
	    }
	}



