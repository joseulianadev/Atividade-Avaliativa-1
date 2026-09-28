/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1190948
 */
import java.util.ArrayList;

public class Box { private int numero, capacidade; 
    private String tipoServico, localizacao; 
    private Mecanico mecanico;
    private ArrayList ordens = new ArrayList<>(); 

public Box(int numero, String tipoServico, int capacidade, String localizacao) {
    this.numero = numero;
    this.tipoServico = tipoServico;
    this.capacidade = capacidade;
    this.localizacao = localizacao;
}

public int getNumero() { return numero; }
public String getTipoServico() { return tipoServico; }
public Mecanico getMecanico() { return mecanico; }
public void setMecanico(Mecanico mecanico) { this.mecanico = mecanico; }
public ArrayList<OrdemServico> getOrdens() { return ordens; }

public String toString() { return "Box " + numero + " - " + tipoServico + " - " + localizacao; }
}