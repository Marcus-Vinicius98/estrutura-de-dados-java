package com.marcus.estruturadados.vetor;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	
	public boolean adiciona(Object elemento) {
		
		aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
		
	}
	
	
	public boolean adicionar(int posicao, Object elemento) {
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
			Object[] elementosNovos = new Object[this.elementos.length * 2];
		for (int i = 0; i < elementos.length; i++) {
			elementosNovos[i] = elementos[i];
			
		}
		elementos = elementosNovos;
			
		}
	}
	
	public int busca(Object elemento) {
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
	
	public Object buscar(int posicao) {
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
