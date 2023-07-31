package controle.atividades;

import java.util.Scanner;

//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

public class Atividade1Modulo4 {
    public static void main(String[] args) {
        
        double num;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificação: ");
        num = scanner.nextDouble();

        if ((num >= 0 && num <= 10) && num%2 == 0) {
            System.out.println("É par e está entre 0 e 10");
        } else {
            System.out.println("Não atende às condições");
        }
        scanner.close();
    }
}
