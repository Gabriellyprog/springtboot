package com.elisitacao.atividade;

import java.util.Scanner;

public class gabrielly {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double maiorAltura = 0;
	        double menorAltura = Double.MAX_VALUE;
	        double somaAlturaHomens = 0;
	        int contagemHomens = 0;
	        int contagemMulheres = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite a altura da pessoa " + i + ": ");
	            double altura = scanner.nextDouble();

	            System.out.print("Digite o sexo da pessoa " + i + " (M para masculino, F para feminino): ");
	            char sexo = scanner.next().toUpperCase().charAt(0);

	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	            }
	            if (altura < menorAltura) {
	                menorAltura = altura;
	            }

	            if (sexo == 'M') {
	                somaAlturaHomens += altura;
	                contagemHomens++;
	            } else if (sexo == 'F') {
	                contagemMulheres++;
	            }
	        }

	        double mediaAlturaHomens = (contagemHomens > 0) ? (somaAlturaHomens / contagemHomens) : 0;

	        System.out.println("Maior altura: " + maiorAltura);
	        System.out.println("Menor altura: " + menorAltura);
	        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
	        System.out.println("Número de mulheres: " + contagemMulheres);
	        
	        scanner.close();
	    }
	}



