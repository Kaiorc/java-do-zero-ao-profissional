package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        
        //Set<String> listaAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<String>();

        listaAprovados.add("Tonho");
        listaAprovados.add("Junio");
        listaAprovados.add("Arlindo");
        listaAprovados.add("Chico");

        System.out.println(listaAprovados);
        
        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);

        for (Integer numero : nums) {
            System.out.println(numero);
        }
    }
}
