package fundamentos.atividades;

import java.util.Scanner;

public class Atividade6Modulo3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();

        scanner.close();

        int delta = (b * b) - 4 * (a * c);

        System.out.printf("A equação é : %dx2 + %dx + %d, o delta dessa equação é: %d \n", a, b , c ,delta);

        System.out.println("Agora será calculado o valor dos X:");

        double delta1 = Double.valueOf(delta);
        
        double x1 = (-(b) + (Math.sqrt(delta1))) / (2 * a);
        double x2 = (-(b) - (Math.sqrt(delta1))) / (2 * a);

        System.out.printf("x1 = %.2f \nx2 = %.2f", x1, x2);
    }
}
