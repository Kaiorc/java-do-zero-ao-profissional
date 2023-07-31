package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        int controle = 0;
        double nota = 0.0;
        double total = 0.0;
        
        Scanner entrada = new Scanner(System.in);

        while (nota != -1) {
            System.out.println("Digite a nova nota: ");
            nota = entrada.nextDouble();

            if(nota >= 0.0 && nota <= 10.0) {
                total = total + nota;
                controle++;
                System.out.println("Número de notas digitadas: " + controle);
                System.out.println("Média = " + (total / controle));
            } else if(nota > 10 || nota < 0.0) {
                    System.out.println("Digite uma nota válida, por favor");
                }
        }
        entrada.close();
    }
}
