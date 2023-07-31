package fundamentos.operadores;

public class DesafioLogicos {
    
    //Desafio - Aula 47
    public static void main(String[] args) {
        
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if ((trabalho1 && trabalho2) == true) {
            System.out.println("Vamos comprar a tv de 50 polegadas e tomar sorvete");
        }else if ((trabalho1 ^ trabalho2) == true){
            System.out.println("Vamos comprar a tv de 32 polegadas e tomar sorvete");
        } else{
             System.out.println("Vamos ficar em casa");
        }
    }
}
