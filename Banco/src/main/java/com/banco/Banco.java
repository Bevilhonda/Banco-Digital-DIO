package com.banco;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> listClientes(){
        return clientes;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
