import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date dataHora;
    private String status;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Item> itens;
    private double valorTotal;

    public Pedido(int id, Cliente cliente, Vendedor vendedor) {
        this.id = id;
        this.dataHora = new Date(); // Pega data/hora atual
        this.status = "em processamento";
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        calcularValorTotal();
    }

    public void removerItem(int codigoItem) {
        itens.removeIf(item -> item.getCodigo() == codigoItem);
        calcularValorTotal();
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = (valorTotal * percentual) / 100;
        valorTotal -= desconto;
    }

    public void calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        this.valorTotal = total;
    }

    public void imprimirResumo() {
        System.out.println("Pedido #" + id);
        System.out.println("Status: " + status);
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Vendedor: " + vendedor.nome);
        System.out.println("Itens:");
        for (Item item : itens) {
            System.out.println("- " + item.descricao + " x" + item.quantidade + " - R$ " + item.calcularSubtotal());
        }
        System.out.println("Valor Total: R$ " + valorTotal);
    }

    // Getters e Setters (se quiser)
}
