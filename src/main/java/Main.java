


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1190948
 */
    
    public class Main {         
        static Oficina oficina = new Oficina();
    
    public static void main(String[] args) {
        criarDados();
        int op;
        do {
            System.out.println("\n1-Cadastrar ordem 2-Associar mecânico 3-Atribuir ordem 4-Ordens do box");
            System.out.println("5-Finalizadas por box 6-Buscar por status 7-Detalhes da ordem 8-Finalizar ordem 0-Sair");
            op = Integer.parseInt(oficina.ler("Opção: "));
            switch (op) {
                case 1 -> oficina.cadastrarOrdem();
                case 2 -> oficina.associarMecanico();
                case 3 -> oficina.atribuirOrdem();
                case 4 -> oficina.ordensDoBox();
                case 5 -> oficina.finalizadasPorBox();
                case 6 -> oficina.buscarPorStatus();
                case 7 -> oficina.detalhesOrdem();
                case 8 -> oficina.finalizarOrdem();
        }
    } while (op != 0);
}

    static void criarDados() {
        oficina.addMecanico(new Mecanico("Carlos", "111.111.111-11", "Motor", "99999-1111"));
        oficina.addMecanico(new Mecanico("Ana", "222.222.222-22", "Elétrica", "99999-2222"));
        oficina.addMecanico(new Mecanico("Pedro", "333.333.333-33", "Funilaria", "99999-3333"));
        oficina.addBox(new Box(1, "Mecânica", 3, "Galpão A"));
        oficina.addBox(new Box(2, "Elétrica", 2, "Galpão A"));
        oficina.addBox(new Box(3, "Funilaria", 2, "Galpão B"));
 }
    }   