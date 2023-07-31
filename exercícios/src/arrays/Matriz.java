package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        int qtdeDeAlunos = 0;
        int qtdeDeNotas = 0;
        double somaDasNotas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        qtdeDeAlunos = scanner.nextInt();

        System.out.println("Digite a quantidade de notas: ");
        qtdeDeNotas = scanner.nextInt();

        double notasDaTurma [] [] = new double [qtdeDeAlunos] [qtdeDeNotas];

        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.println("Digite a nota " + (n + 1) + " do(a) aluno(a) " + (a + 1) + ": ");
                notasDaTurma[a][n] = scanner.nextDouble();
                somaDasNotas += notasDaTurma[a][n];
            }
        }

        for(double alunos[] : notasDaTurma) {
            System.out.println(Arrays.toString(alunos));
        }

        System.out.println("A média das notas da turma é: " + somaDasNotas / (qtdeDeAlunos * qtdeDeNotas));

        scanner.close();
    }
}
