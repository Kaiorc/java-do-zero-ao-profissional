package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        
        int tamanhoDoArray = 0;
        double somaDasNotas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array a ser criado:");
        tamanhoDoArray = scanner.nextInt();
        
        double notas[] = new double[tamanhoDoArray];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota:");
            notas[i] = scanner.nextDouble();
        }

        for(double nota : notas) {
            System.out.println(nota);
            somaDasNotas += nota;
        }

        System.out.printf("A média das notas foi: %.2f", somaDasNotas/tamanhoDoArray);

        scanner.close();
    }
}
