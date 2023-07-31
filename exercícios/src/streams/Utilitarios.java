package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
    // Excluindo a possibilidade de alguém instanciar 
    // a classe (faz sentido pois todos os métodos são
    // estáticos)
    private Utilitarios(){

    };

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public final static String grito(String n) { 
        return n + "!!!";
    }

}