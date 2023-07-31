package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        
        Compra c1 = new Compra();
        Compra c2 = new Compra();
        
        c1.addItem("Banana", 0.50, 10);
        c1.addItem("Maçã", 0.30, 5);
        
        c2.addItem("Sabonete", 8, 1);
        c2.addItem("Shampoo", 10, 1);     
        
        Cliente cliente1 = new Cliente("João");
        cliente1.addCompra(c1);
        cliente1.addCompra(c2);

        System.out.println(cliente1.nome);
        System.out.println(c1.itens);

        System.out.println(c2.itens);
                
        System.out.println(cliente1.obterValorTotal());
    }
}
