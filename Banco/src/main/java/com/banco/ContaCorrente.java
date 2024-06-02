package com.banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void pagarComPix(double valor, IConta contaDestino) {

	}

	@Override
	public void receberPorPix(double valor) {

	}

}
