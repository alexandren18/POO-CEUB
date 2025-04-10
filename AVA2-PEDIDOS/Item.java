public class Item {
    private int codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Item(int codigo, String descricao, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    // Getters e Setters (se precisar)
}
