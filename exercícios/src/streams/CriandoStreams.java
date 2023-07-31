package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        
        Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
        langs.forEach(System.out::println);
        
        String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};

        //Usando Stream.of
        Stream.of(maisLangs).forEach(System.out::println);
        
        //Usando a classe Arrays
        Arrays.stream(maisLangs).forEach(System.out::println);
        Arrays.stream(maisLangs, 1, 4).forEach(System.out::println);

        //Usando Collections
        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(System.out::println);
        outrasLangs.parallelStream().forEach(System.out::println);

        //Stream.generate(() -> "a").forEach(System.out::println);
        Stream.iterate(0, n -> n + 1).forEach(System.out::println);
    }
}
