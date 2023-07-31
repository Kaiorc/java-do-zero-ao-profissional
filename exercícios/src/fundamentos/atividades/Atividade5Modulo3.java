package fundamentos.atividades;

import java.util.Scanner;

public class Atividade5Modulo3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do triângulo: ");
        String valor1 = scanner.nextLine();

        System.out.println("Digite a altura do triângulo: ");
        String valor2 = scanner.nextLine();

        scanner.close();

        Double base = Double.parseDouble(valor1);
        Double altura = Double.parseDouble(valor2);

        Double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area + "cm2");

    }
}
