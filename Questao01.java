package cap03;
import javax.swing.JOptionPane;
public class Questao01 {
  public static void main(String[] args) {
        //Declaração de variáveis
        double num1, num2, sub;
        //Entrada
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        //Processamento
        sub = num1 - num2;
        //Saída
        JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+sub);
    }
}
