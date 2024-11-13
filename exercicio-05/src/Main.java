import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        Crie um programa, no qual terá um vetor de inteiros, cujo tamanho será
        definido pelo valor de uma variável local, que permita ao usuário entrar com
        os valores. Depois, estes valores serão apresentados na ordem inversa à da
        entrada.
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite o tamanho do vetor (numero): ");
        int quantity = 0;

        try {
            quantity = Integer.parseInt(bufferedReader.readLine());
            Integer[] vectorInteger = new Integer[quantity];

            for (int i = 0; i < vectorInteger.length; i++) {
                System.out.print("Digite um numero: ");
                vectorInteger[i] = Integer.parseInt(bufferedReader.readLine());
            }

            for (int i = vectorInteger.length - 1; i >= 0; i--) {
                System.out.println("Posição " + i + " tem o valor: " + vectorInteger[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
