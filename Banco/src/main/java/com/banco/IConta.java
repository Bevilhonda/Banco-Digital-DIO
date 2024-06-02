package com.banco;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    void pagarComPix(double valor, IConta contaDestino);

    void receberPorPix(double valor);

}
