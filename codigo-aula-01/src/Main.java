public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Deise", "123", "ABC10", "Pos Java");
        System.out.println(aluno.toString());

        Professor prof = new Professor("Jose", "456", 1500, "Doutorando");
        prof.setCpf("9630");
        prof.setNome("Fausto");
        prof.setSalario(3500);
        prof.setTitulo("Mestre");

        System.out.println(prof.toString());

    }
}