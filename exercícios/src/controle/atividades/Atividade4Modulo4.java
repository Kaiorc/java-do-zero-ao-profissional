package controle.atividades;

import java.util.Scanner;

//4. Criar um programa que receba um número e diga se ele é um número primo.

public class Atividade4Modulo4 {
    public static void main(String[] args) {
        
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para verificação: ");
        num = scanner.nextInt();

        if (num%1 == 0 && num%num == 0) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
        scanner.close();
    }
}
