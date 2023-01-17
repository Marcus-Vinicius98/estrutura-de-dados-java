package com.marcus.estruturadados.vetor.teste;

import com.marcus.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("M");
		vetor.adiciona("A");
		vetor.adiciona("R");
		vetor.adiciona("C");
		
		System.out.println(vetor);
		
		vetor.adicionar(0, "K");
		
		System.out.println(vetor);
		

	}

}
