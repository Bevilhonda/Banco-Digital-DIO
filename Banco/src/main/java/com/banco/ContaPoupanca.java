package com.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void pagarComPix(double valor, IConta contaDestino) {

	}

	@Override
	public void receberPorPix(double valor) {

	}
}
