package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4356.89);
        Produto p2 = new Produto();

        p2.nome = "Caneta";
        p2.preco = 12.56;

        Produto.desconto = 0.30;

        System.out.println("O valor do produto " + p1.nome + " com desconto é: R$" + p1.produtoComDesconto(p1.preco));
        System.out.println("O valor do produto " + p2.nome + " com desconto é: R$" + p2.produtoComDesconto(p2.preco));
    }
}
