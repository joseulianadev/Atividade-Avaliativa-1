import java.util.ArrayList; import java.util.Scanner;

public class Oficina { private Scanner sc = new Scanner(System.in); private ArrayList mecanicos = new ArrayList<>(); private ArrayList boxes = new ArrayList<>(); private ArrayList ordens = new ArrayList<>();

public void addMecanico(Mecanico m) { mecanicos.add(m); }
public void addBox(Box b) { boxes.add(b); }

public void cadastrarOrdem() {
    String cliente = ler("Cliente: "), modelo = ler("Modelo: "), placa = ler("Placa: ");
    double valor = Double.parseDouble(ler("Valor estimado: "));
    Servico s = new Servico(ler("Serviço: "), Integer.parseInt(ler("Tempo (h): ")),
            Double.parseDouble(ler("Valor do serviço: ")), ler("Categoria (Mecânica/Elétrica/Funilaria): "));
    ordens.add(new OrdemServico(cliente, modelo, placa, valor, s));
    System.out.println("Ordem cadastrada!");
}

public void associarMecanico() {
    for (int i = 0; i < mecanicos.size(); i++) System.out.println(i + " - " + mecanicos.get(i).getNome());
    Mecanico m = mecanicos.get(Integer.parseInt(ler("Mecânico: ")));
    Box b = buscarBox();
    if (m.getBox() != null) {
        System.out.println("Esse mecânico já tem um box!");
    } else {
        if (b.getMecanico() != null) b.getMecanico().setBox(null); // libera o mecânico antigo
        b.setMecanico(m);
        m.setBox(b);
        System.out.println("Mecânico associado!");
    }
}

public void atribuirOrdem() {
    OrdemServico o = buscarOrdem();
    Box b = buscarBox();
    if (!o.getStatus().equals("aberta")) {
        System.out.println("A ordem não está aberta!");
    } else if (!b.getTipoServico().equalsIgnoreCase(o.getServico().getCategoria())) {
        System.out.println("Esse box só aceita serviços de " + b.getTipoServico());
    } else {
        b.getOrdens().add(o);
        o.atribuirBox(b);
        System.out.println("Ordem atribuída!");
    }
}

public void ordensDoBox() {
    Box b = buscarBox();
    for (OrdemServico o : b.getOrdens()) System.out.println(o);
    System.out.println("Total: " + b.getOrdens().size());
}

public void finalizadasPorBox() {
    for (Box b : boxes) {
        int total = 0;
        for (OrdemServico o : ordens) {
            if (o.getStatus().equals("finalizada") && o.getBox() == b) total++;
        }
        System.out.println(b + ": " + total + " finalizada(s)");
    }
}

public void buscarPorStatus() {
    String status = ler("Status (aberta / em execução / finalizada): ");
    for (OrdemServico o : ordens) {
        if (o.getStatus().equalsIgnoreCase(status)) System.out.println(o);
    }
}

public void detalhesOrdem() {
    System.out.println(buscarOrdem());
}

public void finalizarOrdem() {
    OrdemServico o = buscarOrdem();
    if (o.getStatus().equals("em execução")) {
        o.finalizar();
        System.out.println("Ordem finalizada!");
    } else {
        System.out.println("Só ordens em execução podem ser finalizadas.");
    }
}

private Box buscarBox() {
    for (Box b : boxes) System.out.println(b);
    int num = Integer.parseInt(ler("Número do box: "));
    for (Box b : boxes) if (b.getNumero() == num) return b;
    return null;
}

private OrdemServico buscarOrdem() {
    int cod = Integer.parseInt(ler("Código da ordem: "));
    for (OrdemServico o : ordens) if (o.getCodigo() == cod) return o;
    return null;
}

public String ler(String msg) {
    System.out.print(msg);
    return sc.nextLine();
}
}