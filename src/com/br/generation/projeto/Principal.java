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
		System.out.println(" [ 2 ]   Agenda de Vacina��o           ");
		System.out.println("-----------------------------------------------------------");
		System.out.println(" [ 3 ]   Ver Postos de Vacina��o          ");
		System.out.println("===========================================================");
		
		System.out.print(" [Escolha um das Op��es]:   ");		
		opc = scan.nextInt();
		System.out.println("-----------------------------------------------------------");
		
		if(opc == 1) {
		
			
			System.out.print(" [Digite sua Idade]:   ");
			idade = scan.nextInt();
			System.out.println("-----------------------------------------------------------");
						
			if(idade > 59) {
				System.out.println(" Voc� j� deveria ter sido vacinado.\n"
						+ " V� a um posto de vacina��o o mais r�pido poss�vel.");
			}
			
			
			System.out.println("-----------------------------------------------------------");
			
		
			System.out.print(" [ 3 ]   Para Ver Postos de Vacina��o:    ");
			opc = scan.nextInt();
			System.out.println("-----------------------------------------------------------");
			
			if(opc == 3) {
				System.out.print(" Pesquisar Postos de Vacina��o pr�ximo de voc�.\n"
						+ " [Digite o CEP]:   ");
				cep = scan.next();

	}

		}
	}

}