package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Juan", 95);
        Comida c = new Comida("arroz", 0.350);

        System.out.printf("%.2f\n", p.passaPeso());
        
        p.comer(c);
        System.out.printf("%.2f\n", p.passaPeso());
    }
}
