/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    private final String nome;
    private final String categoria;

/**
 *
 * @author 1190948
 */
public class Servico { 
    private String nome, categoria;
}
private int tempoEstimado; private double valor;

public Servico(String nome, int tempoEstimado, double valor, String categoria) {
    this.nome = nome;
    this.tempoEstimado = tempoEstimado;
    this.valor = valor;
    this.categoria = categoria;
}

public String getCategoria() { return categoria; }

public String toString() { return nome + " | " + categoria + " | " + tempoEstimado + "h | R$ " + valor; }
