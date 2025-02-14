public  class aluno{
    private  String nome; // Variavel para armazenar o nome do aluno.
    private  double cansaco; // Variavel para armazenar o nivel de cansaço do aluno %

    public aluno(String nome, double cansaco){
        this.nome = nome;
        this.cansaco = cansaco;
    }
    // Metodo que retorna o nome do aluno

    public String getNome() {
        return nome;
    }

    // Metodo que retorna o nivel de cançaso do aluno
    public double getCansaco() {
        return cansaco;
    }

    // Metodo qua altera o nivel de cansaço do aluno
    public void setCansaco(double cansaco) {
        this.cansaco = cansaco;
    }
}

