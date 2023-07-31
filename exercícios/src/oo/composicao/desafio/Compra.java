package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<Item>();

    void addItem(Produto p, int quantidade){
        this.itens.add((new Item(p, quantidade)));
    }

    void addItem(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome,preco);
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal(){
        double total = 0.0;

        for(Item item : itens){
            total += item.quantidade * item.produto. preco;
        }
        return total;
    }
}
