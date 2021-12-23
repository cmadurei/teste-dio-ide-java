package br.com;

import br.com.model.Gato;

public class SegPrg {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}
}

class Livros {
	private String nome; 
	private String autor;
}