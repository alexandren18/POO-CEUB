public class Aluno extends Pessoa {
    private int matricula;
    private boolean ativo;
    private float bolsaDesconto;

    public void ativar() {
        this.ativo = true;
        System.out.println("Aluno ativado.");
    }

    public void manterAluno() {
        System.out.println("Aluno mantido.");
    }

    
    public boolean isAtivo() {
        return ativo;
    }
}
