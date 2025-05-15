import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String cpfPessoa;
    private String nomePessoa;
    private String logradouroEndereco;
    private String nroEndereco;
    private String complementoEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private UfBrasil ufEndereco;
    private String cepEndereco;
    private Date dataNascimento;

    private List<TelefonePessoa> telefones = new ArrayList<>();

    public void manterPessoa() {
        System.out.println("Pessoa mantida.");
    }

    // Getters e Setters
    public void adicionarTelefone(TelefonePessoa telefone) {
        telefones.add(telefone);
    }

    public List<TelefonePessoa> getTelefones() {
        return telefones;
    }
}
