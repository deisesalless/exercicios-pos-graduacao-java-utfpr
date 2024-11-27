public class MinhaException extends Exception {

    // Faça assim, esse é o mais utilizado e melhor abordado para adaptar a mensagem que quiser
    public MinhaException(String mensagem) {
        super(mensagem);
    }

    // Exemplo de outra forma de criar sua propria exception
    public MinhaException(int numero) {
        System.out.println("Lançou numero negativo");
    }

    // Ou assim
    public String getMensagem() {
        return getMessage();
    }
}
