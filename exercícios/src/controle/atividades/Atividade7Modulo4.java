package controle.atividades;

import java.util.Scanner;

/*7. Criar um programa que enquanto estiver recebendo números positivos,
imprime no console a soma dos números inseridos, caso receba um número 
negativo, encerre o programa. Tente utilizar a estrutura do while. */

public class Atividade7Modulo4 {
    public static void main(String[] args) {
        
        int valor;
        int acumulado = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite o valor a ser somado: ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                acumulado += valor;
                System.out.println("O valor acumulado é: " + acumulado); 
            }
        } while (valor >= 0);

        scanner.close();
    }
}
