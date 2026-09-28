/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1190948
 */
import java.time.LocalDate;

public class OrdemServico { 
    private static int contador = 1; 
    private int codigo; private String cliente, modelo, placa, status = "aberta"; private LocalDate data = LocalDate.now(); 
    private double valorEstimado; private Servico servico; private Box box; 

public OrdemServico(String cliente, String modelo, String placa, double valorEstimado, Servico servico) {
    this.codigo = contador++;
    this.cliente = cliente;
    this.modelo = modelo;
    this.placa = placa;
    this.valorEstimado = valorEstimado;
    this.servico = servico;
}

public int getCodigo() { return codigo; }
public String getStatus() { return status; }
public Servico getServico() { return servico; }
public Box getBox() { return box; }

public void atribuirBox(Box box) {
    this.box = box;
    status = "em execução";
}

public void finalizar() {
    box.getOrdens().remove(this); 
    status = "finalizada";
}

public String toString() {
    String info = (box == null) ? "sem box" : box + " | Mecânico: " + box.getMecanico();
    return "OS " + codigo + " | " + cliente + " | " + modelo + " " + placa + " | " + data
            + " | " + status + " | R$ " + valorEstimado + "\n   Serviço: " + servico + "\n   " + info;
}
}