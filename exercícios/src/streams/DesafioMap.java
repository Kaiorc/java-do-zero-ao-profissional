package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
* 1. Número para string binária... 6 => "110"
* 2. Inverter a string... "110" => "011"
* 3. Converter de volta para inteiro => "011" => 3
*/

public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9);
        
        // usando o UnaryOperator pois é de String para String
        // StringBuilder é uma classe da API que ajuda a manipular Strings 
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        // usando Function pois receberá a String de "inverter" e retornará um Integer
        Function<String, Integer> reverter = s -> Integer.parseInt(s, 2);

        nums.stream()
            .map(Integer::toBinaryString) // toBinaryString converte Integer em String
            .map(inverter)
            .map(reverter)
            .forEach(System.out::println);

    }
}
