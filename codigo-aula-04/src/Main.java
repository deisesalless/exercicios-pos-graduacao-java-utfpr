public class Main {

    public static void testaNumero(int numero) throws MinhaException {
        if(numero > 0) System.out.println("\n NUMERO POSITIVO: " + numero);
        // pode fazer assim e utilizar o public MinhaException(String mensagem)
        else throw new MinhaException("Numero deve ser maior que zero");

        // pode fazer assim e utilizar o public MinhaException(int numero)
        //else throw new MinhaException(numero);
    }
    public static void main(String[] args) {

        try {
            testaNumero(-2);
        } catch (MinhaException e) {
            System.err.println("\n Disparou minha excecao: " + e);
            System.out.println("\n Mensagem do getMsg() "+ e.getMensagem());
        }
    }
}
