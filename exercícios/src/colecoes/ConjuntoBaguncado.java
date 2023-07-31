package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("O tamanho de conjunto é: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add("x");

        System.out.println("O tamanho de conjunto agora é: " + conjunto.size());

        conjunto.add("teste");
        conjunto.add("X");

        System.out.println("O tamanho de conjunto agora é: " + conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("x"));

        System.out.println(conjunto);

        System.out.println(conjunto.contains("X"));
        System.out.println(conjunto.contains("teste"));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();

        nums.add(1);       
        nums.add(2);       
        nums.add(3);
        
        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.addAll(nums);
        System.out.println(conjunto);
        
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}