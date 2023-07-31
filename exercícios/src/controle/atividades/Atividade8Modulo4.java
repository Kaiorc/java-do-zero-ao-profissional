package controle.atividades;

import java.util.Scanner;

/*8. Criar um programa que receba uma palavra e 
imprime no console letra por letra. */

public class Atividade8Modulo4 {
    public static void main(String[] args) {
        
        String s;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a palavra a ser impressa");
        s = scanner.nextLine();

        for (int i = 0; i != s.length(); i++){
            System.out.println(s.charAt(i));
        }
        
        scanner.close();
    }    
}
