package com.marcus.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*public void adiciona(String elemento) throws Exception {
	  if (this.tamanho < this.elementos.length) {
		  this.elementos[this.tamanho] = elemento;
		  this.tamanho++;
		 } else {
			 throw new Exception("O vetor já está cherio");
		 }
	}*/
	
	public boolean adiciona(String elemento) {
		
		aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
		
	}
	
	
	public boolean adicionar(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida"); 
			
		}
		this.aumentaCapacidade();
		//mover os dados 
		
		for (int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return false;
		
		
	}
	
	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
		 String[] elementosNovos = new String[this.elementos.length * 2];
		for (int i = 0; i < elementos.length; i++) {
			elementosNovos[i] = elementos[i];
			
		}
		elementos = elementosNovos;
			
		}
	}
	
	public int busca(String elemento) {
		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida"); 
			}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public String buscar(int posicao) {
		if (!(posicao > 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
			
		}
		return this.elementos[posicao];
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		
		
		for (int i = 0; i < this.tamanho - 1; i++) {
			
			s.append(this.elementos[i]);
			s.append(", ");	
			
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		
		
		return s.toString();
	}
	
}
