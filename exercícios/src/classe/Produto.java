package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(){

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double produtoComDesconto(double preco){
        return preco * (1 - desconto);
        
    }
}
