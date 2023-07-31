package controle.atividades;

import java.util.Scanner;

/*3. Criar um programa que receba duas notas parciais, calcular a média final. 
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
caso contrário imprime no console "Reprovado".*/

public class Atividade3Modulo4 {
    public static void main(String[] args) {
    
        double nota1;
        double nota2;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 4){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
