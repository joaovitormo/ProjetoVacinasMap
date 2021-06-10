package com.br.generation.projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		String cep;
		int opc;
		
		
		System.out.println("===========================================================");
		System.out.println("                        Vacina|S|\n "
				+ "                           Ma|P|");
		System.out.println("===========================================================");											
		System.out.println(" [ 1 ]   Vacinar                   ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" [ 2 ]   Agenda de Vacinação           ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" [ 3 ]   Ver Postos de Vacinação          ");
		System.out.println("===========================================================");
		
		System.out.print(" [Escolha um das Opções]:   ");		
		opc = scan.nextInt();
		System.out.println("-----------------------------------------------------------");
		
		if(opc == 1) {
		
			
			System.out.print(" [Digite sua Idade]:   ");
			idade = scan.nextInt();
			System.out.println("-----------------------------------------------------------");
						
			if(idade > 59) {
				System.out.println(" Você já deveria ter sido vacinado.\n"
						+ " Vá a um posto de vacinação o mais rápido possível.");
			}
			
			
			System.out.println("-----------------------------------------------------------");
			
		
			System.out.print(" [ 3 ]   Para Ver Postos de Vacinação:    ");
			opc = scan.nextInt();
			System.out.println("-----------------------------------------------------------");
			
			if(opc == 3) {
				System.out.print(" Pesquisar Postos de Vacinação próximo de você.\n"
						+ " [Digite o CEP]:   ");
				cep = scan.next();

	}

		}
	}

}