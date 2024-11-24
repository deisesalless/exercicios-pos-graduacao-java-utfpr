public class Professor extends Pessoa {
    private int salario;
    private String titulo;

    public Professor() {
        super();
        this.salario = 0;
        this.titulo = "";
    }

    public Professor(String nome, String cpf, int salario, String titulo) {
        super(nome, cpf);
        this.salario = salario;
        this.titulo = titulo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void impLocal() { // implementacao obrigatoria do metodo abstrato
        System.out.println("Estou na classe Professor");
    }

    @Override
    public String toString() {
        return "Professor {" +
                "nome = " + getNome() +
                ", CPF = " + getCpf() +
                ", salario = " + salario +
                ", titulo = " + titulo +
                "}";
    }
}
