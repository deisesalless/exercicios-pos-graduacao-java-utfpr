import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        1)_ Construa um programa que permita ao usuário entrar com determinada
        frase, depois permita “escolher” uma letra qualquer e: caso a letra escolhida
        esteja na frase (seja maiúscula ou minúscula) diga quantas vezes ela
        apareceu e em que posição da frase. Senão, apareça uma frase informando
        que esta letra não existe na frase.
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Por favor digite uma frase: ");
            String phrase = bufferedReader.readLine();

            System.out.print("Por favor digite uma letra: ");
            String text = bufferedReader.readLine();

            int cont = 0;
            String a = "";
            if (phrase.toLowerCase().contains(text.toLowerCase())) {
                for (int i = 0; i < phrase.length(); i++) {
                    a = String.valueOf(phrase.charAt(i));
                    if (a.equals(text)) cont++;
                }

                System.out.println("A letra " + text + " aparece na frase " + cont + " vezes");
            } else {
                System.out.println("A letra " + text + " não está na frase");
            }

        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
