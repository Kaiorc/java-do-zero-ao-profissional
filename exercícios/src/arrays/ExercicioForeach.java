package arrays;

import java.util.Arrays;

//Adaptação da classe Exercicio, utilizando foreach no
//lugar dos for
public class ExercicioForeach {
    public static void main(String[] args) {
     
        double notasAlunoA[] = new double[4];
        
        System.out.println(Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        
        System.out.println(notasAlunoA[0]);
        
        //printa o último elemento do array
        System.out.println(notasAlunoA.length - 1); 

        double totalAlunoA = 0;

        for(double nota: notasAlunoA){
            totalAlunoA += nota;
        }

        System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double nota: notasAlunoB) {
			totalAlunoB += nota;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
        
    }
}
