import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        /*
        Faça o mesmo procedimento do exercício anterior, porém desta vez estará
        usando uma matriz bidimensional
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite a quantidade de linhas da matriz: ");
            int quantityLine = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Digite a quantidade de colunas da matriz: ");
            int quantityColumn = Integer.parseInt(bufferedReader.readLine());
            Integer[][] matrixInteger = new Integer[quantityLine][quantityColumn];

            for (int i = 0; i < matrixInteger.length; i++) {
                for (int j = 0; j < matrixInteger[i].length; j++) {

                    System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                    matrixInteger[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }

            for (int i = matrixInteger.length - 1; i >= 0; i--) {
                for (int j = matrixInteger[i].length - 1; j >= 0; j--) {

                    System.out.println("Valor na posição [" + i + "][" + j + "]: " + matrixInteger[i][j]);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
