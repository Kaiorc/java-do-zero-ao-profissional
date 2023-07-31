package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
     
        //Calcula o preço com desconto
        Function<Produto, Double> precoComDesconto = 
                produto -> produto.preco * (1 - produto.desconto);
        //Calcula o preço com imposto
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        //Calcula o preço com frete
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        //Calcula o preço arredondado
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f",preco));
        //Faz a formatação
        Function<Double, String> formatar = 
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String precoFinal = precoComDesconto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);   

        System.out.println("O preço final é de " + precoFinal);
    }
}
