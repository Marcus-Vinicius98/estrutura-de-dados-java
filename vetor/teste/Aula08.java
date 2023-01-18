package com.marcus.estruturadados.vetor.teste;

import com.marcus.estruturadados.vetor.Vetor;

public class Aula08 {
	public static void main(String[] args) {

		Vetor vetor = new Vetor(1);

		vetor.adiciona("M");
		vetor.adiciona("A");
		vetor.adiciona("R");
		vetor.adiciona("C");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

	}

}
