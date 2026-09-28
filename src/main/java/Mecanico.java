/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1190948
 */
public class Mecanico { 
    private String nome, cpf, especialidade, telefone;
    private Box box; 

public Mecanico(String nome, String cpf, String especialidade, String telefone) {
    this.nome = nome;
    this.cpf = cpf;
    this.especialidade = especialidade;
    this.telefone = telefone;
}

public String getNome() { return nome; }
public Box getBox() { return box; }
public void setBox(Box box) { this.box = box; }

    @Override
    public String toString() { return nome + " (" + especialidade + ", " + telefone + ")"; }
}