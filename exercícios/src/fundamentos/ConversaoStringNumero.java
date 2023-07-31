package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

        System.out.println(valor1 + valor2); //São Strings, portanto, são concatenadas nesse print

        Double numero1 = Double.parseDouble(valor1);
        Double numero2 = Double.parseDouble(valor2);

        System.out.println(numero1 + numero2); //São Strings transformadas em Double, portanto, são somados nesse print 
        System.out.println("Média é:" + (numero1 + numero2)/2);

    }
    
}
