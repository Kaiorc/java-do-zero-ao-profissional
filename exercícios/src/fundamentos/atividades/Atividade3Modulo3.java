package fundamentos.atividades;

import java.util.Scanner;

public class Atividade3Modulo3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        String valor1 = scanner.nextLine();

        System.out.println("Digite a altura: ");
        String valor2 = scanner.nextLine();

        scanner.close();
        
        Double peso = Double.parseDouble(valor1.replace(",", "."));
        Double altura = Double.parseDouble(valor2.replace(",", "."));
        
        Double imc = peso / (altura * altura);

        System.out.println(imc);
    }
}
