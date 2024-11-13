import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        Utilizando a Linguagem de programação Java,
        implemente um programa que permita a entrada de um
        valor inteiro e informe se este valor é “par” ou “ímpar”.
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite um valor: ");

        try {
            int valor = Integer.parseInt(bufferedReader.readLine());
            int resto = valor % 2;
            String resultado = (resto == 0) ? "par" : "impar";

            System.out.println("O numero " + valor + " é " +  resultado);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
