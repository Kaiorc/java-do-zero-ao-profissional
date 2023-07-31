package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {
        
        double a = 1; //Conversão implícita
        System.out.println(a);

        float b = (float) 1.123456788888; //Conversão explícita (cast)
        System.out.println(b);


        int c = 4; //Byte é menor que int(que suporta 4x mais que o byte), então pode haver problema na saída.
        byte d = (byte) c;//portanto, é necessário tomar cuidado com esses tipos de cast (menor -> maior)
        System.out.println(d);


        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);

    }

    
}
