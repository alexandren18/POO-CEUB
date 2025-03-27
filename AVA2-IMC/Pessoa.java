public class Pessoa {
    //Atributos da classe
    private String nomePessoa;
    private double  pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;
    private String analiseImcPessoa;

    // metodo construtor Pessoa
    public Pessoa (String nomePessoa, double pesoPessoa,  double alturaPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
        this.analiseImcPessoa = analisarImcPessoa();

    }

    // metado para calcular imc da pessoa
    private static double calcularImcPessoa(double peso, double altura) {
        double imc = 0.0;
        imc = peso / (Math.pow(altura, 2));
        return imc; 
    }

    // metodo para analisar imc da pessoa
    private String analisarImcPessoa(){
        
        if (imcPessoa < 18.5) {
            return "Baixo peso. É recomendado procurar um médico.";
        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
            return "Peso adequado. Avalie outros parâmetros corporais.";
        } else if (imcPessoa >= 25 && imcPessoa <= 29.9) {
            return "Sobrepeso. Consulte um médico e reveja hábitos.";
        } else if (imcPessoa >= 30 && imcPessoa <= 34.9) {
            return "Obesidade Grau I. Busque orientação médica e nutricional.";
        } else if (imcPessoa >= 35 && imcPessoa <= 39.9) {
            return "Obesidade Grau II. Não atrase a busca por orientação médica.";
        } else {
            return "Obesidade Grau III. A chance de doenças associadas é alta. Busque orientação médica.";
        }
    }
    
    // metodo para mostrar a pessoa,imc e analise do imc
    public void mostrarImcAnalisePessoa(){
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa);
        System.out.println("Altura: " + this.alturaPessoa);
        System.out.println("IMC: " + this.imcPessoa);
        System.out.println("Analise do IMC: " + this.analiseImcPessoa);
    }

    

}


    

    



    

