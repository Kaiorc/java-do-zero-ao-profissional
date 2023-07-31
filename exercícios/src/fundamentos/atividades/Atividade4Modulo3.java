package fundamentos.atividades;

import java.util.Scanner;

public class Atividade4Modulo3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        String valor = scanner.nextLine();

        scanner.close();

        Double valor1 = Double.parseDouble(valor);

        System.out.println("Elevado a 2: " + valor1 * valor1);
        System.out.println("Elevado a 3: " + valor1 * valor1 * valor1);
        
    }
}
