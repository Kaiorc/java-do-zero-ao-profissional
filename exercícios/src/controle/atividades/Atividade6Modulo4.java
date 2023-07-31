package controle.atividades;

import java.util.Random;
import java.util.Scanner;

/*6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
 Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas 
 para adivinhar o número gerado. Ao final de cada tentativa, imprima a 
 quantidade de tentativas restantes, e imprima se o número inserido é 
 maior ou menor do que o número armazenado. */

 public class Atividade6Modulo4 {
    public static void main(String[] args) {
        
        int tent = 10;
        int valor;
        int valorAleatorio;
        
        Random random = new Random();
        valorAleatorio = random.nextInt(100);

        System.out.println(valorAleatorio);
        
        Scanner scanner = new Scanner(System.in);
        
        
        do {
            System.out.println("Digite o seu palpite:");
            valor = scanner.nextInt();
            
            if (valor == valorAleatorio) {
                System.out.println("Você acertou");
                break;
            } else if (valor > valorAleatorio) {
                System.out.println("Você errou, o valor é menor que este.");
            } else {
                System.out.println("Você errou, o valor é maior que este.");
            }
        
            System.out.println("Tentativas restantes: " + tent);
            tent--;
        } while (tent != 0);

        scanner.close();
    }
}
