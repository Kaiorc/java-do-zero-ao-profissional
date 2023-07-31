package controle.atividades;

import java.util.Scanner;

//5. Refatorar o exercício 04, utilizando a estrutura switch.

public class Atividade5Modulo4 {
    public static void main(String[] args) {
        
        int num;
        int contaDivisor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificação: ");
        num = scanner.nextInt();

        // i começa como 2 pois já é definido que todo número é divisível por 1.
        // Então o i percorre até um valor antes do número, verificando se há
        // algum divisor além de 1 e do próprio número. Se houver, então o número
        // tem mais que dois divisores (que assumimos serem 1 e ele mesmo), portanto,
        // não é primo.
        for (int i = 2; i < num; i++){
            if (num%i == 0) {
                contaDivisor++;
            }
        }

        switch (contaDivisor) {
            case 0:
                System.out.println("É primo");
                break;
            default:
                System.out.println("Não é primo");
        }

        scanner.close();
    }
}
