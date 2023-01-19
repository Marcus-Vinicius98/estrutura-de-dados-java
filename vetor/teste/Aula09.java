package com.marcus.estruturadados.vetor.teste;

import com.marcus.estruturadados.vetor.VetorObjetos;

public class Aula09 {
	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(3);
		vetor.adiciona("Marcus");
		vetor.adiciona(2.0);
		
		
		System.out.println(vetor);

	}

}
