package controle.atividades;

import java.util.Scanner;

//2. Criar um programa informa se o ano atual é um ano bissexto;

public class Atividade2Modulo4 {
    public static void main(String[] args) {
        
        int ano;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual para verificação: ");
        ano = scanner.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + "é bissexto");
        } else {
            System.out.println(ano + "não é bissexto");
        }

        scanner.close();
    }
}
