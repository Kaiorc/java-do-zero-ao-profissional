package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Digite o primeiro valor :");
        String num2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        String operacao = JOptionPane.showInputDialog("Digite a operação que deseja: ");

        Integer valor1 = Integer.parseInt(num1);
        Integer valor2 = Integer.parseInt(num2);

        Integer resultado = (operacao.contains("+")) ? (valor1 + valor2) : 0;
        resultado = (operacao.contains("-")) ? (valor1 - valor2) : resultado;
        resultado = (operacao.contains("/")) ? (valor1 / valor2) : resultado;
        resultado = (operacao.contains("*")) ? (valor1 * valor2): resultado;
        
        System.out.println(resultado);
    }
}
