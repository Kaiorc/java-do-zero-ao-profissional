package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
     
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
        
        marcas.stream().map(m -> m.toUpperCase()).forEach(System.out::println);

        // UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        // UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\nUsando Composição");
        marcas.stream()
            // chamando o método da maneira convencional
            .map(Utilitarios.maiuscula)
            .map(primeiraLetra)
            //chamando o método usando method reference para o método em Utilitários
            .map(Utilitarios::grito)
            .forEach(System.out::println);

        

    }
}
