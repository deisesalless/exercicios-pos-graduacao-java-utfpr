public class Aluno extends Pessoa {

    private String ra;
    private String curso;

    public Aluno() {
        super();
        this.ra = "";
        this.curso = "";
    }

    public Aluno(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "nome = " + getNome() +
                ", CPF = " + getCpf() +
                ", RA = " + ra +
                ", curso = " + curso +
                "}";
    }
}
