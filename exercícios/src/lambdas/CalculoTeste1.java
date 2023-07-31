package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        
        Calculo calc = new Soma();
        
        System.out.println(calc.executar(2, 2));

        calc = new Multiplicar();

        System.out.println(calc.executar(5, 5));
    }
}