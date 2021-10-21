package SistemaEscolar.model;

public class Aluno {
    private String id;
    private String nome;
    private String matricula;
    private String dt_nascimento;
    private String[] colunas = new String[]{"ID", "NOME", "MATRICULA", "DATA NASCIMENTO"};

    public Aluno() {
    }

    public Aluno(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(final String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] Colunas) {
        this.colunas = Colunas;
    }
}