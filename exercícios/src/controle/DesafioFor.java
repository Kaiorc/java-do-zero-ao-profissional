package controle;

public class DesafioFor {
    public static void main(String[] args) {
        
        String valor = "#";
        
        for (; !valor.contains("######"); valor +="#"){
            System.out.println(valor);
         }
    }
}
