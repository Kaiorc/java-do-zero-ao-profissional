package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double a =  Math.pow((6*(3+2)), 2);
        double a2 = a/(2*3);

        double b =  Math.pow(((5 - 1) * (7 - 2))/2, 2);

        double c =  Math.pow((a2 - b), 3);

        double d =  Math.pow(10, 3);

        double d2 = c / d;

        System.out.println(d2);

    }
    
}
