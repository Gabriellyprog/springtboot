package com.elisitacao.atividade;

import java.util.Scanner;

public class agbys {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a altura da parede (hp): ");
	        double hp = scanner.nextDouble();

	        System.out.print("Digite a largura da parede (lp): ");
	        double lp = scanner.nextDouble();

	        System.out.print("Digite a altura do azulejo (ha): ");
	        double ha = scanner.nextDouble();

	        System.out.print("Digite a largura do azulejo (la): ");
	        double la = scanner.nextDouble();

	        double areaParede = hp * lp;
	        double areaAzulejo = ha * la;

	        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

	        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);

	        scanner.close();
	    }
	}



