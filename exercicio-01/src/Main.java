public class Main {
    public static void main(String[] args) {
        String[] phrase = new String[6];
        phrase[5] = ";-)";
        phrase[0] = "Caro amigo,";
        phrase[2] = "a programar em Java.";
        phrase[4] = "Java na UTFPR";
        phrase[1] = "convido você a aprender";
        phrase[3] = "Faça a especialização";

        for (int i = 0; i < phrase.length; i++) {
            System.out.println(phrase[i]);
        }
    }
}
