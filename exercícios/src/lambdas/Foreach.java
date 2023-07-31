package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
    
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        System.out.println("Forma tradicional utilizando foreach:");
        for(String a : aprovados){
            System.out.println(a);
        }
        
        System.out.println("Forma usando lambda #01:");
        aprovados.forEach(a -> System.out.println(a));
        
        System.out.println("Forma usando lambda #02:");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        //É mais automatizado, portanto não permite muita personalização,
        //diferente das opções anteriores
        System.out.println("Forma usando Method Reference #01:");
        aprovados.forEach(System.out::println);
        
        System.out.println("Forma usando Method Reference #02:");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é " + nome);
    }
}