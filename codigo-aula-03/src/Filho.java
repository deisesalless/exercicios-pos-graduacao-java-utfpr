public class Filho extends Pai implements Mae, Calc{

    @Override
    public void impDados() {
        super.impDados();
    }


    @Override
    public void impData() { // idade é o atributo que recebeu da interface mae
        System.out.println("Metodo implementado da interface MAE - idade " + idade);
    }

    @Override
    public void soma() {
        System.out.println("A soma de 1 + 1 é = " + (1+1));
    }
}
