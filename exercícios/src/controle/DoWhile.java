package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    String texto = "por favor";

    do {
        System.out.println("Diga, diga as palavras mágicas imediatamente\nDiga:");
        texto = entrada.nextLine();
    } while (!texto.equalsIgnoreCase("por favor"));

    System.out.println("Pode ir");
    entrada.close();
    }
}