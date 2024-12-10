package model;

import java.util.List;

public class Carro {

    private String modelo;
    private String cor;
    private String motor;
    private List<String> acessorios;
    private String combustivel;
    private Integer portas;
    private Integer ano;
    private boolean sistemaDeNavegacao;

    public Carro() {
    }

    public Carro(String modelo, String cor, String motor, List<String> acessorios, String combustivel, Integer portas, Integer ano, boolean sistemaDeNavegacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.acessorios = acessorios;
        this.combustivel = combustivel;
        this.portas = portas;
        this.ano = ano;
        this.sistemaDeNavegacao = sistemaDeNavegacao;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "modelo = '" + modelo + '\'' +
                ", cor = '" + cor + '\'' +
                ", motor = '" + motor + '\'' +
                ", acessorios = " + acessorios +
                ", combustivel = '" + combustivel + '\'' +
                ", portas = " + portas +
                ", ano = " + ano +
                ", sistemaDeNavegacao=" + sistemaDeNavegacao +
                '}';
    }
}
