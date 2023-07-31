package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        
        Musica m1 = new Musica("Dream On","Aerosmith", "Classic Rock");
        Musica m2 = new Musica("Cудно", "Молчат Дома", "Post-Punk Dark Wave");
        Musica m3 = new Musica("Big Log","Robert Plant", "Classic Rock");
        Musica m4 = new Musica("Under The Sun", "Cuco", "Synthwave Dream Pop ");

        List<Musica> musicas = Arrays.asList(m1, m2, m3, m4);
        Predicate<Musica> rockClassico = m -> m.genero.equals("Classic Rock");
        
        musicas.stream()
            .filter(rockClassico)
            .map(m -> m.nome)
            .forEach(System.out::println);
    }
}
