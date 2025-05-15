public class Professor extends Pessoa {
    private String titularidade;
    private NivelEscolar nivelEscolaridade;

    public void manterProfessor() {
        System.out.println("Professor mantido.");
    }

    // Getters e Setters
    public String getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }

    public NivelEscolar getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(NivelEscolar nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }
}
