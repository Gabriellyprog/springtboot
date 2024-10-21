package com.elisitacao.atividade;

import java.util.Scanner;

public class gabys {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a massa (m) em quilogramas: ");
	        double massa = scanner.nextDouble();

	        System.out.print("Digite a altura (h) em metros: ");
	        double altura = scanner.nextDouble();

	        System.out.print("Digite o tempo (t) em segundos: ");
	        double tempo = scanner.nextDouble();

	        double cavalos = (massa * altura / tempo) / 745.6999;

	        System.out.printf("Quantidade de cavalos necessários: %.4f\n", cavalos);

	        scanner.close();
	    }
	}


