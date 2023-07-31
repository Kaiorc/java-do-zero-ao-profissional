package fundamentos;

import java.util.Scanner;

//Desafio Aula - 37
public class DesafioConversao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String val1 = scanner.nextLine();

        System.out.println("Informe o segundo salário: ");
        String val2 = scanner.nextLine();
        
        System.out.println("Informe o terceiro salário:");
        String val3 = scanner.nextLine();
        
        scanner.close();

        Double valor1 = Double.parseDouble(val1.replace(",", "."));
        Double valor2 = Double.parseDouble(val2.replace(",", "."));
        Double valor3 = Double.parseDouble(val3.replace(",", "."));

        System.out.println("3º salário: R$" + valor1);
        System.out.println("2º salário: R$" + valor2);
        System.out.println("3º salário: R$" + valor3);
        System.out.println("Média salarial: R$"+ (valor1 + valor2 + valor3)/3);
    }
}
