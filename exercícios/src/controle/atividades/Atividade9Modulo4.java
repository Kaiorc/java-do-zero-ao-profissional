package controle.atividades;

import java.util.Scanner;

//9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

public class Atividade9Modulo4 {
    public static void main(String[] args) {
        
        int valor;
        int maior = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor de posição " + i + ":");
            valor = scanner.nextInt();

            if (valor > maior){
                maior = valor;
            }
        }
        
        System.out.println("O maior valor digitado foi: " + maior);

        scanner.close();
    }
}
