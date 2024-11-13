import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        G1)_ Construa um programa que:
        a)_ Permita o usuário entrar com 2 valores (que sejam armazenados em duas variáveis, por exemplo, “a” e “b”);
        b)_ Apresente “menu de opções” com 4 opções:
        Exemplo:
        Menu de Opções:
        1 – Somar (a+b)
        2 – multiplicar (a*b)
        3 - subtrair (a-b)
        5 – dividir (a/b)
        Escolha uma opção:
        c)_ Após o usuário escolher uma opção, apareça uma linha informando o resultado do cálculo que foi
        escolhido:
        Exemplo (sendo escolhida a 1ª opção e “a” valendo 2 e “b” valendo 1):
        “A soma de a + b é: 3”
        Para tanto use as estruturas de entrada de dados via console, conversão de tipos e a estrutura de
        seleção switch..case.
        */

        double a = 0;
        double b = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("===== MENU =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Multiplicar");
        System.out.println("3 - Subtrair");
        System.out.println("4 - Dividir");
        System.out.print("Digite o numero da sua opção: ");

        try {
            int opcao = Integer.parseInt(bufferedReader.readLine());
            switch (opcao) {
                case 1:
                    System.out.printf("Digite um valor: ");
                    a =  Double.parseDouble(bufferedReader.readLine());
                    System.out.printf("Digite outro valor: ");
                    b =  Double.parseDouble(bufferedReader.readLine());
                    System.out.println("A soma entre " + a + " e " + b + " é : " + (a + b));
                    break;

                case 2:
                    System.out.printf("Digite um valor: ");
                    a =  Double.parseDouble(bufferedReader.readLine());
                    System.out.printf("Digite outro valor: ");
                    b =  Double.parseDouble(bufferedReader.readLine());
                    System.out.println("A multiplicacao entre " + a + " e " + b + " é : " + (a * b));
                    break;

                case 3:
                    System.out.printf("Digite um valor: ");
                    a =  Double.parseDouble(bufferedReader.readLine());
                    System.out.printf("Digite outro valor: ");
                    b =  Double.parseDouble(bufferedReader.readLine());
                    System.out.println("A subtracao entre " + a + " e " + b + " é : " + (a - b));
                    break;

                case 4:
                    System.out.printf("Digite um valor: ");
                    a =  Double.parseDouble(bufferedReader.readLine());
                    System.out.printf("Digite outro valor: ");
                    b =  Double.parseDouble(bufferedReader.readLine());
                    System.out.println("A soma entre " + a + " e " + b + " é : " + (a / b));
                    break;

                default:
                    System.out.println("Escolha um numero entre 1 e 5");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
