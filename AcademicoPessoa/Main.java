import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.manterAluno();
        aluno.ativar();

        Professor professor = new Professor();
        professor.setTitularidade("Doutor");
        professor.setNivelEscolaridade(NivelEscolar.DOUTORADO);
        professor.manterProfessor();

        TelefonePessoa telefone = new TelefonePessoa("61999999999", TipoFone.CELULAR);
        aluno.adicionarTelefone(telefone);

        System.out.println("Telefone do aluno: " + aluno.getTelefones().get(0).getNumeroTelefone());
    }
}
