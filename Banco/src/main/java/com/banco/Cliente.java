package com.banco;

public class Cliente {

	private final String nome;
	private final String sobrenome;

	public Cliente(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
}
