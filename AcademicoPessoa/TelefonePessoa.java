public class TelefonePessoa {
    private String numeroTelefone;
    private TipoFone tipoTelefone;

    public TelefonePessoa(String numeroTelefone, TipoFone tipoTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoTelefone = tipoTelefone;
    }

    public void adicionarTelefone() {
        System.out.println("Telefone adicionado.");
    }

    public void removerTelefone() {
        System.out.println("Telefone removido.");
    }

    public void alterarTelefone(String novoNumero, TipoFone novoTipo) {
        this.numeroTelefone = novoNumero;
        this.tipoTelefone = novoTipo;
        System.out.println("Telefone alterado.");
    }

    
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public TipoFone getTipoTelefone() {
        return tipoTelefone;
    }
}
