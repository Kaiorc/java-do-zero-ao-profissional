package classe;

public class DataTeste {
    public static void main(String[] args) {
     
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data(25, 4, 1980);

        d1.dia = 25;
        d1.mes = 2;
        d1.ano = 1999;        
        
        System.out.println( d1.obterDataFormatada());
        System.out.println( d2.obterDataFormatada());
        System.out.println( d3.obterDataFormatada());
    }
}